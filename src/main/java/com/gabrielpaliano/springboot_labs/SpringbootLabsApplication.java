package com.gabrielpaliano.springboot_labs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootLabsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLabsApplication.class, args);
		System.out.println("Olá mundo.");
	}

}
