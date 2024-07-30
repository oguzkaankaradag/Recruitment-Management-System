package com.example.interview_service.repository;


import com.example.interview_service.entity.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewRepository extends JpaRepository<Interview, Long> {
}
