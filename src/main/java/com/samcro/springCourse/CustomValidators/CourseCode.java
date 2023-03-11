package com.samcro.springCourse.CustomValidators;

import java.lang.annotation.Retention;
import javax.validation.Constraint;
import java.lang.annotation.*;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface CourseCode {
    //define default course code
    public String value() default "LUV";
    //define default error message
    public String message() default "must start with LUV";
    //define default groups
    public Class<?>[] groups() default {};
    //define default payloads
    public Class<? extends Payload>[] payload() default {};
}
