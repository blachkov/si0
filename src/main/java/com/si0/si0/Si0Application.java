package com.si0.si0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Si0Application {

	@GetMapping("/")
	public String home() {
		return "Rest service !!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Si0Application.class, args);
	}

}
