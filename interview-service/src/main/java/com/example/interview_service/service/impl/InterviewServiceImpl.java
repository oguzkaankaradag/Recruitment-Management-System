package com.example.interview_service.service.impl;


import com.example.interview_service.entity.Interview;
import com.example.interview_service.repository.InterviewRepository;
import com.example.interview_service.service.InterviewService;
import com.example.interview_service.service.JobPostingClient;
import com.example.job_posting_service.entity.JobPosting;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class InterviewServiceImpl implements InterviewService {

    @Autowired
    private InterviewRepository interviewRepository;

    @Autowired
    private JobPostingClient jobPostingClient;

    public JobPosting getJobPostingById(Long id) {
        return jobPostingClient.getJobPostingById(id);
    }

    @Override
    public Interview createInterview(Interview interview) {
        return interviewRepository.save(interview);
    }

    @Override
    public Interview updateInterview(Long id, Interview interview) {
        if (interviewRepository.existsById(id)) {
            interview.setId(id);
            return interviewRepository.save(interview);
        }
        return null;
    }

    @Override
    public void deleteInterview(Long id) {
        interviewRepository.deleteById(id);
    }

    @Override
    public Interview getInterviewById(Long id) {
        return interviewRepository.findById(id).orElse(null);
    }

    @Override
    public List<Interview> getAllInterviews() {
        return interviewRepository.findAll();
    }

}
