package com.backend.backendBurgos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.backend.backendBurgos.model")
public class BackendBurgosApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendBurgosApplication.class, args);
	}
}
