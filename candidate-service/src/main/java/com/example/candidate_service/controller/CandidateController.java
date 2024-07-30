package com.example.candidate_service.controller;


import com.example.candidate_service.entity.Candidate;
import com.example.candidate_service.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @PostMapping
    public ResponseEntity<Candidate> createCandidate(@RequestBody Candidate candidate) {
        Candidate createdCandidate = candidateService.createCandidate(candidate);
        return new ResponseEntity<>(candidate, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Candidate> updateCandidate(@PathVariable Long id, @RequestBody Candidate candidate) {
        return ResponseEntity.ok(candidateService.updateCandidate(id, candidate));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCandidate(@PathVariable Long id) {
        candidateService.deleteCandidate(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Candidate> getCandidateById(@PathVariable Long id) {
        return ResponseEntity.ok(candidateService.getCandidateById(id));
    }

    @GetMapping
    public ResponseEntity<List<Candidate>> getAllCandidates() {
        return ResponseEntity.ok(candidateService.getAllCandidates());
    }
}
