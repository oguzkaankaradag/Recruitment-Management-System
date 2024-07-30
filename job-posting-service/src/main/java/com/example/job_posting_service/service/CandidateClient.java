package com.example.job_posting_service.service;


import com.example.candidate_service.entity.Candidate;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "candidate-service")
public interface CandidateClient {
    @GetMapping("/candidates/{id}")
    Candidate getCandidateById(@PathVariable("id") Long id);
}
