package com.example.interview_service.controller;


import com.example.interview_service.entity.Interview;
import com.example.interview_service.service.InterviewService;
import com.example.interview_service.service.JobPostingClient;
import com.example.job_posting_service.entity.JobPosting;
import com.example.job_posting_service.service.JobPostingService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interviews")
@NoArgsConstructor
@AllArgsConstructor
public class InterviewController {

    @Autowired
    private InterviewService interviewService;

    @Autowired
    private JobPostingClient jobPostingClient;

    @GetMapping("/job-posting/{id}")
    public JobPosting getJobPostingById(@PathVariable Long id) {
        return jobPostingClient.getJobPostingById(id);
    }

    @PostMapping
    public ResponseEntity<Interview> createInterview(@RequestBody Interview interview) {
        Interview createdInterview = interviewService.createInterview(interview);
        return new ResponseEntity<>(createdInterview, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Interview> updateInterview(@PathVariable Long id, @RequestBody Interview interview) {
        return ResponseEntity.ok(interviewService.updateInterview(id, interview));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInterview(@PathVariable Long id) {
        interviewService.deleteInterview(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Interview> getInterviewById(@PathVariable Long id) {
        return ResponseEntity.ok(interviewService.getInterviewById(id));
    }

    @GetMapping
    public ResponseEntity<List<Interview>> getAllInterviews() {
        return ResponseEntity.ok(interviewService.getAllInterviews());
    }
}
