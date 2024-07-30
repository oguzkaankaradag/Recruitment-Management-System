package com.example.interview_service.service;


import com.example.interview_service.entity.Interview;
import com.example.job_posting_service.entity.JobPosting;

import java.util.List;

public interface InterviewService {
    Interview createInterview(Interview interview);
    Interview updateInterview(Long id, Interview interview);
    void deleteInterview(Long id);
    Interview getInterviewById(Long id);
    List<Interview> getAllInterviews();

}
