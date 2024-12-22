package com.arul.thymeleaf;

import org.springframework.boot.SpringApplication;

public class TestSpringThymeleafDemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringThymeleafDemoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
