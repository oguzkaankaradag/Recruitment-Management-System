package com.example.job_posting_service.service;


import com.example.job_posting_service.entity.JobPosting;

import java.util.List;

public interface JobPostingService {
    JobPosting createJobPosting(JobPosting jobPosting);
    JobPosting updateJobPosting(Long id, JobPosting jobPosting);
    void deleteJobPosting(Long id);
    JobPosting getJobPostingById(Long id);
    List<JobPosting> getAllJobPostings();
}
