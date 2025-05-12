package com.sb.statebenefits.service;

import com.sb.statebenefits.model.Claimant;
import com.sb.statebenefits.repository.ClaimantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimantService {

    private final ClaimantRepository repository;

    public ClaimantService(ClaimantRepository repository) {
        this.repository = repository;
    }

    public Claimant registerClaimant(Claimant claimant) {
        boolean eligible = checkEligibility(claimant.getIncome(), claimant.getDependents());
        claimant.setEligible(eligible);
        return repository.save(claimant);
    }

    public List<Claimant> getAllClaimants() {
        return repository.findAll();
    }

    private boolean checkEligibility(double income, int dependents) {
        double threshold = 2000 + (dependents * 500);
        return income < threshold;
    }
}
