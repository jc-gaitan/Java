package com.example.obspringejercicios.controller;

import com.example.obspringejercicios.entities.Laptop;
import com.example.obspringejercicios.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    @Autowired
    private LaptopRepository laptopRepository;

    //Obtener todas las laptops
    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    // obtener una laptop segun su id
    @GetMapping("/api/laptop/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable String id){
        Optional<Laptop> laptopOpt = laptopRepository.findById(id);
        return laptopOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // crear una laptop
    @PostMapping("/api/laptop")
    public Laptop save(@RequestBody Laptop book){
        // guardar la laptop recivida por parámetro en la base de datos
        return laptopRepository.save(book);
    }

}
