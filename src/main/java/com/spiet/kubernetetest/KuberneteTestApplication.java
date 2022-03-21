package com.spiet.kubernetetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(path = "/v1/teste")
public class KuberneteTestApplication {

	@GetMapping
	private String hello() {
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(KuberneteTestApplication.class, args);
	}

}
