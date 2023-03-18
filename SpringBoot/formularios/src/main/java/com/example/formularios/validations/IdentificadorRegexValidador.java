package com.example.formularios.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//Crear una anotacion personalizada
public class IdentificadorRegexValidador implements ConstraintValidator<IdentificadorRegex, String> {
    @Override
    public void initialize(IdentificadorRegex constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        if(s.matches("[0-9]{2}[.,][\\d]{3}[.,][\\d]{2}[-][A-Z]{1}")){
            return true;
        }

        return false;
    }
}
