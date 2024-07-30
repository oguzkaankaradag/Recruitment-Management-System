package com.example.job_posting_service.controller;


import com.example.job_posting_service.entity.JobPosting;
import com.example.job_posting_service.service.JobPostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job-postings")
public class JobPostingController {

    @Autowired
    private JobPostingService jobPostingService;

    @PostMapping
    public ResponseEntity<JobPosting> createJobPosting(@RequestBody JobPosting jobPosting) {
        JobPosting createdJobPosting = jobPostingService.createJobPosting(jobPosting);
        return new ResponseEntity<>(createdJobPosting, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobPosting> updateJobPosting(@PathVariable Long id, @RequestBody JobPosting jobPosting) {
        return ResponseEntity.ok(jobPostingService.updateJobPosting(id, jobPosting));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJobPosting(@PathVariable Long id) {
        jobPostingService.deleteJobPosting(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobPosting> getJobPostingById(@PathVariable Long id) {
        return ResponseEntity.ok(jobPostingService.getJobPostingById(id));
    }

    @GetMapping
    public ResponseEntity<List<JobPosting>> getAllJobPostings() {
        return ResponseEntity.ok(jobPostingService.getAllJobPostings());
    }
}
