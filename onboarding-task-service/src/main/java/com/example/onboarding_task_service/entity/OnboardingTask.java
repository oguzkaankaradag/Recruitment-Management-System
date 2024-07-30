package com.example.onboarding_task_service.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "onboarding_tasks")
public class OnboardingTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskName;
    private String description;

    // Getters and Setters
}
