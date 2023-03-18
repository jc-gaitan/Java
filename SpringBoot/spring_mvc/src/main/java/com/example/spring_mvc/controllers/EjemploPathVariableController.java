package com.example.spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploPathVariableController {

    @GetMapping("/string/{texto}")
    public String variables(@PathVariable String texto, Model model){
        model.addAttribute("title", "Recibir parametros de la ruta (@PathVariable)");
        model.addAttribute("resultado", "El texto enviado en la ruta es = " + texto);
        return "variables/ver";
    }

    //varias variables
    @GetMapping("/string/{texto}/{numero}")
    public String variables(@PathVariable String texto, @PathVariable String numero, Model model){
        model.addAttribute("title", "Recibir parametros de la ruta (@PathVariable)");
        model.addAttribute("resultado", "El texto enviado en la ruta es = " + texto
        + " El numero enviado en el path es = " + numero);
        return "variables/ver";
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("title", "Enviar parametros de la ruta (@PathVariable)");
        return "variables/index";
    }

}
