package com.gftFeGc.mavenTa33;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GftFeGcJavaMavenTa33082023Application {

	public static void main(String[] args) {
		SpringApplication.run(GftFeGcJavaMavenTa33082023Application.class, args);
	}

	
	@GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
    }
}
