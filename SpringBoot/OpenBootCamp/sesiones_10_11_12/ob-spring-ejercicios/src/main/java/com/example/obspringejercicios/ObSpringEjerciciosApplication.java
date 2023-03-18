package com.example.obspringejercicios;

import com.example.obspringejercicios.entities.Laptop;
import com.example.obspringejercicios.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringEjerciciosApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObSpringEjerciciosApplication.class, args);

		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);

		// CRUD
		// crear libro
		Laptop laptop1 = new Laptop(null, "ThinkBook", 888.88, "Lenovo", true);
		Laptop laptop2 = new Laptop(null, "Terminator", 1999.99, "Asus", true);

		System.out.println("Num laptos en base de datos: " + laptopRepository.findAll().size());

		// almacenar las laptops
		laptopRepository.save(laptop1);
		laptopRepository.save(laptop2);

		// recuperar todos los libros
		System.out.println("Num laptops en base de datos: " + laptopRepository.findAll().size());

		// borrar una laptops
		// laptopRepository.deleteById("1");

		//System.out.println("Num laptops en base de datos: " + laptopRepository.findAll().size());
	}

}
