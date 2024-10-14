package com.example.micro.invetory_service;

import org.springframework.boot.SpringApplication;

public class TestInvetoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(InvetoryServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
