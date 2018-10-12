package com.royarn.spring.annotation;

import java.lang.annotation.*;

/**
 * Description:
 *
 * @author dell
 * @date 2018-10-12
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SFAutowired {
    String value() default "";
}
