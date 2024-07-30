package com.example.candidate_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CandidateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CandidateServiceApplication.class, args);
	}

}
