package com.example.inventorysystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class InventorysystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(InventorysystemApplication.class, args);
			System.out.println("Backend Running...");
		}

	}
