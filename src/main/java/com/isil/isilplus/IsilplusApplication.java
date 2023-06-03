package com.isil.isilplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IsilplusApplication {

	public static void main(String[] args) {

		System.out.print("Esta es mi primera aplicacion en SpringBoot");

		SpringApplication.run(IsilplusApplication.class, args);
	}

}
