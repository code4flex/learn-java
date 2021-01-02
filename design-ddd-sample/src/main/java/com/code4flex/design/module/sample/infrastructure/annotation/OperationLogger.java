package com.code4flex.design.module.sample.infrastructure.annotation;

import java.lang.annotation.*;

/**
 * 自定义操作注解
 *
 * @author mavin
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OperationLogger {
    public String name() default "";

    public boolean isSaveRequestParams() default true;
}
