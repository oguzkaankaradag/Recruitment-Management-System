package com.example.onboarding_task_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OnboardingTaskServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnboardingTaskServiceApplication.class, args);
	}

}
