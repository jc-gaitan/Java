package com.example.inyeccion_dependencias.models.services;

import org.springframework.stereotype.Component;


@Component("miServicioComplejo")
public class MiServicioComplejo implements  IServicio{

    @Override
    public String operacion(){
        return "servicio complicado";
    }

}
