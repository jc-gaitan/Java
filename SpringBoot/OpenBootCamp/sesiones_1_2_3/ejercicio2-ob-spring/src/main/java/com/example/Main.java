package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Recibir un objeto NotificationService de Spring
        NotificationService notificationService = (NotificationService) context.getBean("notificationService");
        String texto = notificationService.saludo();
        System.out.println("saludo desde notificationService = " + texto);

        // Cargar un bean dentro de otro bean
        UserService userService = (UserService) context.getBean("userService");
        System.out.println("saludo desde userService = " + userService.notificationService.saludo());

    }
}
