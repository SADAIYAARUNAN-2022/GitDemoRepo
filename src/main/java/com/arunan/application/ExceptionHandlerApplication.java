package com.arunan.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.arunan"})
public class ExceptionHandlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionHandlerApplication.class, args);

	}

}
