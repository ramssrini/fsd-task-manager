package com.fsd.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FsdTaskManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FsdTaskManagerApplication.class, args);
		System.out.println("Hello : Spring Boot Statup project is working");
	}

}
