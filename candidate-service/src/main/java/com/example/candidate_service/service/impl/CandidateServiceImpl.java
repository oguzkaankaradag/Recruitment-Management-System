package com.example.candidate_service.service.impl;


import com.example.candidate_service.entity.Candidate;
import com.example.candidate_service.repository.CandidateRepository;
import com.example.candidate_service.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImpl implements CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public Candidate createCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @Override
    public Candidate updateCandidate(Long id, Candidate candidate) {
        if (candidateRepository.existsById(id)) {
            candidate.setId(id);
            return candidateRepository.save(candidate);
        }
        return null;
    }

    @Override
    public void deleteCandidate(Long id) {
        candidateRepository.deleteById(id);
    }

    @Override
    public Candidate getCandidateById(Long id) {
        return candidateRepository.findById(id).orElse(null);
    }

    @Override
    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }
}
