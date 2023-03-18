package com.example.inyeccion_dependencias.controllers;

import com.example.inyeccion_dependencias.controllers.domain.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    private Factura factura;

    @GetMapping("/ver")
    public String ver(Model model){
        model.addAttribute("titulo",
                "Ejemplo factura con inyeccion de dependecia");

        model.addAttribute("factura", factura);

        return "factura/ver";
    }

}
