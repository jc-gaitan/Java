package com.example.formularios.validations;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class RequeridoValidador implements ConstraintValidator<Requerido, String> {

    @Override
    public void initialize(Requerido constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        /*if(value == null || value.isEmpty() || value.isBlank()){
            return false;
        }*/
        if(value == null || !StringUtils.hasText(value)){
            return false;
        }
        return true;
    }
}
