package com.example.onboarding_task_service.controller;


import com.example.onboarding_task_service.entity.OnboardingTask;
import com.example.onboarding_task_service.service.OnboardingTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/onboarding-tasks")
public class OnboardingTaskController {
    @Autowired
    private OnboardingTaskService onboardingTaskService;

    @PostMapping
    public ResponseEntity<OnboardingTask> createOnboardingTask(@RequestBody OnboardingTask onboardingTask) {
        OnboardingTask createdOnboardingTask = onboardingTaskService.createOnboardingTask(onboardingTask);
        return new ResponseEntity<>(onboardingTask, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OnboardingTask> updateOnboardingTask(@PathVariable Long id, @RequestBody OnboardingTask onboardingTask) {
        return ResponseEntity.ok(onboardingTaskService.updateOnboardingTask(id, onboardingTask));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOnboardingTask(@PathVariable Long id) {
        onboardingTaskService.deleteOnboardingTask(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OnboardingTask> getOnboardingTaskById(@PathVariable Long id) {
        return ResponseEntity.ok(onboardingTaskService.getOnboardingTaskById(id));
    }

    @GetMapping
    public ResponseEntity<List<OnboardingTask>> getAllOnboardingTasks() {
        return ResponseEntity.ok(onboardingTaskService.getAllOnboardingTasks());
    }
}
