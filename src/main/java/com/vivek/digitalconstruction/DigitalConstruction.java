package com.vivek.digitalconstruction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DigitalConstruction {
	
	public static void main(String[] args) {
		SpringApplication.run(DigitalConstruction.class, args);
	}

}