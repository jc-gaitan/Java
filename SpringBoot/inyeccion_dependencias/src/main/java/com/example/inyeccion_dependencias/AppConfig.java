package com.example.inyeccion_dependencias;

import com.example.inyeccion_dependencias.controllers.domain.ItemFactura;
import com.example.inyeccion_dependencias.controllers.domain.Producto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    //Definir Bean en Spring
    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("camara", 100);
        Producto producto2 = new Producto("carro", 1000);

        ItemFactura item1 = new ItemFactura(producto1, 5);
        ItemFactura item2 = new ItemFactura(producto2, 2);

        return Arrays.asList(item1, item2);
    }

    @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto1 = new Producto("monitor", 250);
        Producto producto2 = new Producto("escritorio", 500);
        Producto producto3 = new Producto("laptop", 1500);
        Producto producto4 = new Producto("impresora", 100);

        ItemFactura item1 = new ItemFactura(producto1, 5);
        ItemFactura item2 = new ItemFactura(producto2, 2);
        ItemFactura item3 = new ItemFactura(producto3, 1);
        ItemFactura item4 = new ItemFactura(producto4, 6);

        return Arrays.asList(item1, item2, item3, item4);
    }

}
