package com.example.onboarding_task_service.service;


import com.example.onboarding_task_service.entity.OnboardingTask;

import java.util.List;

public interface OnboardingTaskService {
    OnboardingTask createOnboardingTask(OnboardingTask onboardingTask);
    OnboardingTask updateOnboardingTask(Long id, OnboardingTask onboardingTask);
    void deleteOnboardingTask(Long id);
    OnboardingTask getOnboardingTaskById(Long id);
    List<OnboardingTask> getAllOnboardingTasks();
}
