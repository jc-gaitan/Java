package com.example.obspringejercicios.entities;

import javax.persistence.*;

@Entity
@Table(name = "laptops")
public class Laptop {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private Double price;
    private String brand;
    private Boolean online;

    //Contructores
    public Laptop() {
    }

    public Laptop(String id, String name, Double price, String brand, Boolean online) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.online = online;
    }

    //Getter and Setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }
}
