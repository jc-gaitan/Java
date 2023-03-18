package com.example.obspringejercicios.controller;

import com.example.obspringejercicios.entities.Laptop;
import com.example.obspringejercicios.repository.LaptopRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    private final Logger log = LoggerFactory.getLogger(LaptopController.class);

    @Autowired
    private LaptopRepository laptopRepository;

    //Obtener todas las laptops
    @GetMapping("/api/laptops")
    @ApiOperation("Obtener todas las laptop guardadas. ")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    // obtener una laptop segun su id
    @GetMapping("/api/laptop/{id}")
    @ApiOperation("Buscar una laptop por clave primaria id. ")
    public ResponseEntity<Laptop> findOneById(@PathVariable String id){
        Optional<Laptop> laptopOpt = laptopRepository.findById(id);
        return laptopOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // crear una laptop
    @PostMapping("/api/laptop")
    @ApiOperation("Crear laptop")
    public Laptop save(@ApiParam("El id se genera automaticamente. ") @RequestBody Laptop laptop){
        // guardar la laptop recivida por parámetro en la base de datos
        return laptopRepository.save(laptop);
    }

    @DeleteMapping("/api/laptop/{id}")
    @ApiOperation("Eliminar una laptop por Id")
    public ResponseEntity<Laptop> delete(@PathVariable String id){

        if(!laptopRepository.existsById(id)){
            log.warn("Trying to delete a non existent LAPTOP");
            return ResponseEntity.notFound().build();
        }

        laptopRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    @ApiIgnore//Ignorar este método para que no aparezca en la documentación de la api Swagger
    @DeleteMapping("/api/laptops")
    public ResponseEntity<Laptop> deleteAll(){
        log.info("REST Request for delete all laptops");
        laptopRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }

}
