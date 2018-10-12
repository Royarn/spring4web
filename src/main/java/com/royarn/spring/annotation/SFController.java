package com.royarn.spring.annotation;

import java.lang.annotation.*;

/**
 * Description:
 *
 * @author dell
 * @date 2018-10-12
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SFController {
    String value() default "";
}