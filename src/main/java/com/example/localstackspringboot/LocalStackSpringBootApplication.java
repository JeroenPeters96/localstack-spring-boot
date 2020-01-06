package com.example.localstackspringboot;

import io.smartup.localstack.EnableLocalStack;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableLocalStack
public class LocalStackSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocalStackSpringBootApplication.class, args);
	}

}
