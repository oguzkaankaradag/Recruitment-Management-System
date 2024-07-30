package com.example.job_posting_service.service.impl;


import com.example.candidate_service.entity.Candidate;
import com.example.job_posting_service.entity.JobPosting;
import com.example.job_posting_service.repository.JobPostingRepository;
import com.example.job_posting_service.service.CandidateClient;
import com.example.job_posting_service.service.JobPostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostingServiceImpl implements JobPostingService {
    @Autowired
    private JobPostingRepository jobPostingRepository;

    @Autowired
    private CandidateClient candidateClient;

    public Candidate getCandidateById(Long id) {
        return candidateClient.getCandidateById(id);
    }

    @Override
    public JobPosting createJobPosting(JobPosting jobPosting) {
        return jobPostingRepository.save(jobPosting);
    }

    @Override
    public JobPosting updateJobPosting(Long id, JobPosting jobPosting) {
        if (jobPostingRepository.existsById(id)) {
            jobPosting.setId(id);
            return jobPostingRepository.save(jobPosting);
        }
        return null;
    }

    @Override
    public void deleteJobPosting(Long id) {
        jobPostingRepository.deleteById(id);
    }

    @Override
    public JobPosting getJobPostingById(Long id) {
        return jobPostingRepository.findById(id).orElse(null);
    }

    @Override
    public List<JobPosting> getAllJobPostings() {
        return jobPostingRepository.findAll();
    }
}
