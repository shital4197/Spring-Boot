package com.tka;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class VehicleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleProjectApplication.class, args);

		System.out.println("Application is running....");
	}

}
