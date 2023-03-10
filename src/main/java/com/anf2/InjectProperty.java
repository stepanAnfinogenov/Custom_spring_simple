package com.anf2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/**
 * @author Stepan Anfi
 *  ${DATE}
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface InjectProperty {
    String value() default "";
}
