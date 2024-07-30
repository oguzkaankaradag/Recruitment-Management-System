package com.example.onboarding_task_service.repository;


import com.example.onboarding_task_service.entity.OnboardingTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OnboardingTaskRepository extends JpaRepository<OnboardingTask, Long> {
}
