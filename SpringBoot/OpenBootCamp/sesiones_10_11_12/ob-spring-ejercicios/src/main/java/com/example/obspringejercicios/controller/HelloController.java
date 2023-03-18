package com.example.obspringejercicios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@ApiIgnore
public class HelloController {

    @GetMapping("/api/saludo")
    public String saludar(){
        return "Buenos dias. ";
    }

    @GetMapping("/api/only")
    public String only(){
        return "only admin. ";
    }

}
