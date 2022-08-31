package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class FirstSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringApplication.class, args);
	}
}
