package com.example.inyeccion_dependencias.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("miServicioSimple")
//Cuando hay varias clases que implementan la misma interfas con primary esta sera la que se inyecta por defecto
@Primary
public class MiServicio implements  IServicio{

    @Override
    public String operacion(){
        return "servicio Simple";
    }

}
