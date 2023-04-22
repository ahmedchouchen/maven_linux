package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.example.controller","com.example.service"})

public class maven_ahmedApplication {

	public static void main(String[] args) {
		SpringApplication.run(maven_ahmedApplication.class, args);
		// testing webhook
		// testing email notification
	}

}

