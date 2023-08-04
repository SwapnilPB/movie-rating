package com.swap.movierating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.swap.service")
public class MovieratingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieratingApplication.class, args);
	}

}
