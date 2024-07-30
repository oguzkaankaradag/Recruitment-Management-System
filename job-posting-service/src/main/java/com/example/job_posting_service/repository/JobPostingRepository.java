package com.example.job_posting_service.repository;


import com.example.job_posting_service.entity.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostingRepository extends JpaRepository<JobPosting, Long> {
}
