package com.example.interview_service.service;

import com.example.job_posting_service.entity.JobPosting;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "job-posting-service", url = "http://localhost:8080")
public interface JobPostingClient {

    @GetMapping("/job-postings/{id}")
    JobPosting getJobPostingById(@PathVariable("id") Long id);
}
