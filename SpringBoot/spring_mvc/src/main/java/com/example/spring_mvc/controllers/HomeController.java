package com.example.spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //Para redirigir a una ruta
    @GetMapping("/")
    public String home(){
        //para redirigir a una ruta interna reiniciando el request
        //return "redirect:/app/index";

        //para redirigir a una ruta externa reiniciando el request
        //return "redirect:https://www.google.com";

        //para redirigir a una ruta interna sin reiniciar el request sin recargar la pagina
        //los parametros de request no se pierden - no cambiar la url
        //No se puede hacer para una pagina externa
        return "forward:/app/index";
    }

}
