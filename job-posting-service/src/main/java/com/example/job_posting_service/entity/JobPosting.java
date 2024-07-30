package com.example.job_posting_service.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "job_postings")
public class JobPosting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

}
