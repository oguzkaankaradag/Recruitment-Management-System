package com.example.interview_service.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "interviews")
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long candidateId;
    private Long jobPostingId;
    private LocalDateTime interviewDate;
    private String interviewer;
}
