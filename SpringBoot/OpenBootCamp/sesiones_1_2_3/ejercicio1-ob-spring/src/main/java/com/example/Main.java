package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //Recibir un objeto de Spring
        Saludo saludo = (Saludo) context.getBean("saludo");
        //Utilizar el metodo imprimir saludo
        saludo.imprimirSaludo();

    }
}
