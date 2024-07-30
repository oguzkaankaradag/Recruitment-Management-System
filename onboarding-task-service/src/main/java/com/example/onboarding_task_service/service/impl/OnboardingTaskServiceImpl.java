package com.example.onboarding_task_service.service.impl;


import com.example.onboarding_task_service.entity.OnboardingTask;
import com.example.onboarding_task_service.repository.OnboardingTaskRepository;
import com.example.onboarding_task_service.service.OnboardingTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OnboardingTaskServiceImpl implements OnboardingTaskService {
    @Autowired
    private OnboardingTaskRepository onboardingTaskRepository;

    @Override
    public OnboardingTask createOnboardingTask(OnboardingTask onboardingTask) {
        return onboardingTaskRepository.save(onboardingTask);
    }

    @Override
    public OnboardingTask updateOnboardingTask(Long id, OnboardingTask onboardingTask) {
        if (onboardingTaskRepository.existsById(id)) {
            onboardingTask.setId(id);
            return onboardingTaskRepository.save(onboardingTask);
        }
        return null;
    }

    @Override
    public void deleteOnboardingTask(Long id) {
        onboardingTaskRepository.deleteById(id);
    }

    @Override
    public OnboardingTask getOnboardingTaskById(Long id) {
        return onboardingTaskRepository.findById(id).orElse(null);
    }

    @Override
    public List<OnboardingTask> getAllOnboardingTasks() {
        return onboardingTaskRepository.findAll();
    }
}
