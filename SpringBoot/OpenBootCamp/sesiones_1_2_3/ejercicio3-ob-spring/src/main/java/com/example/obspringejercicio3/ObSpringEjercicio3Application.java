package com.example.obspringejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringEjercicio3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObSpringEjercicio3Application.class, args);

		CocheRepository repository = context.getBean(CocheRepository.class);

		System.out.println("Hay: " + repository.count() + " carros en la base de datos. ");

		// crear y almacenar un coche en base de datos
		Coche mercedes = new Coche(null, "Mercedes", "sls", 2022);
		repository.save(mercedes);

		System.out.println("Hay: " + repository.count() + " carros en la base de datos. ");

		// recuperar todos
		System.out.println(repository.findAll());
	}

}
