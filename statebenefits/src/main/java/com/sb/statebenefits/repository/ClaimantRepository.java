package com.sb.statebenefits.repository;

import com.sb.statebenefits.model.Claimant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimantRepository extends JpaRepository<Claimant, Long> {
    // JpaRepository gives us built-in CRUD methods: save(), findAll(), deleteById(), etc.
}
