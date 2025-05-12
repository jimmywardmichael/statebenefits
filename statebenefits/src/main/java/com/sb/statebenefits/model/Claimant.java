package com.sb.statebenefits.model;

import jakarta.persistence.*;

@Entity
public class Claimant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String ssn;
    private double income;
    private int dependents;
    private boolean isEligible;

    public Claimant() {}

    public Claimant(String fullName, String ssn, double income, int dependents) {
        this.fullName = fullName;
        this.ssn = ssn;
        this.income = income;
        this.dependents = dependents;
        this.isEligible = false; // Default
    }

    // Getters and Setters
    public Long getId() { return id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getSsn() { return ssn; }
    public void setSsn(String ssn) { this.ssn = ssn; }

    public double getIncome() { return income; }
    public void setIncome(double income) { this.income = income; }

    public int getDependents() { return dependents; }
    public void setDependents(int dependents) { this.dependents = dependents; }

    public boolean isEligible() { return isEligible; }
    public void setEligible(boolean eligible) { isEligible = eligible; }
}
