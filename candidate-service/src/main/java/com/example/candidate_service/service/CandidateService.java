package com.example.candidate_service.service;


import com.example.candidate_service.entity.Candidate;

import java.util.List;

public interface CandidateService {
    Candidate createCandidate(Candidate candidate);
    Candidate updateCandidate(Long id, Candidate candidate);
    void deleteCandidate(Long id);
    Candidate getCandidateById(Long id);
    List<Candidate> getAllCandidates();
}
