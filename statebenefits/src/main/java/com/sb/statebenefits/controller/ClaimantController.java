package com.sb.statebenefits.controller;

import com.sb.statebenefits.model.Claimant;
import com.sb.statebenefits.service.ClaimantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/claimants")
@CrossOrigin
public class ClaimantController {

    private final ClaimantService service;

    public ClaimantController(ClaimantService service) {
        this.service = service;
    }

    @PostMapping
    public Claimant createClaimant(@ModelAttribute Claimant claimant) {
        return service.registerClaimant(claimant);
    }

    @GetMapping
    public List<Claimant> listClaimants() {
        return service.getAllClaimants();
    }

}

