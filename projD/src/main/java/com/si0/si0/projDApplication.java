package com.si0.si0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class projDApplication {

	@GetMapping("/")
	public String home() {
		return "Rest service !!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(projDApplication.class, args);
	}

}