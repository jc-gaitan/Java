package com.example.formularios.validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

//Crear una anotacion personalizada
@Constraint(validatedBy = IdentificadorRegexValidador.class)
@Retention(RUNTIME)
@Target({FIELD,METHOD})
public @interface IdentificadorRegex{

    String message() default "Identificador Invalido";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}