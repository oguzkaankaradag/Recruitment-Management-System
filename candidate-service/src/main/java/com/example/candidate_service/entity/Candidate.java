package com.example.candidate_service.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "candidates")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String resume;

}
