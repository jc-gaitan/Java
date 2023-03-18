package com.example.inyeccion_dependencias.controllers;

import com.example.inyeccion_dependencias.models.services.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @Autowired
    @Qualifier("miServicioComplejo")//Permite seleccionar que componente queremos inyectar por medio del nombre
    private IServicio servicio;

    /*@Autowired //si inyectamos por constructor se puede omitir el @Autowired
    public indexController(IServicio servicio) {
        this.servicio = servicio;
    }*/

    @GetMapping({"", "/", "/index", "/home"})
    public String index(Model model){
        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }

    /*@Autowired //Inyector por el metodo set
    public void setServicio(IServicio servicio) {
        this.servicio = servicio;
    }*/
}
