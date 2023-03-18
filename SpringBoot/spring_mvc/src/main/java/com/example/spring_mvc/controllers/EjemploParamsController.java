package com.example.spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

    //Para obtener parametros desde la url se usa @RequestParam
    @GetMapping("/string")
    public String param(@RequestParam(name = "texto", required = false, defaultValue = "No envio nada") String texto, Model model){
        model.addAttribute("resultado", "El texto enviado es = " + texto);
        return "params/ver";
        /*
        La url seria http://localhost:3000/params/string?texto=Hola que tal
        con ?nombrevariable = valor
        */
    }

    @GetMapping("/")
    public String index(){
        return  "params/index";
    }

    @GetMapping("/mix-params")
    public String param(@RequestParam String saludo, @RequestParam Integer numero, Model model){
        model.addAttribute("resultado", "El saludo es = '" + saludo + "' y el numero es = '" + numero + "'");
        return "params/ver";
    }

    @GetMapping("/mix-params-request")
    public String param(HttpServletRequest request, Model model){
        String saludo = request.getParameter("saludo");
        Integer numero = null;

        try{
            numero = Integer.parseInt(request.getParameter("numero"));
        }catch (NumberFormatException e){
            numero = 0;
        }

        model.addAttribute("resultado", "El saludo es = '" + saludo + "' y el numero es = '" + numero + "'");
        return "params/ver";
    }

}
