package com.dake.annotation;

import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Verify {

    String massage() default "com.dake.annotation.Verify";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    boolean notBlank() default false;

    boolean isNumber() default false;

    int maxLength () default 2147483647;

    int minLength () default 0;

}
