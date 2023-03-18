package com.example.formularios.validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = RequeridoValidador.class)
@Retention(RUNTIME)
@Target({FIELD,METHOD})
public @interface Requerido {

    String message() default "El campo es Requerido";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
