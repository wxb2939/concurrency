package com.imooc.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * 课程里用来标示线程不安全的类和写法
 */
@Target(ElementType.TYPE) //对应的目标
@Retention(RetentionPolicy.SOURCE)  //编辑的时候忽略掉
public @interface NotThreadSafe {
    String value() default "";
}
