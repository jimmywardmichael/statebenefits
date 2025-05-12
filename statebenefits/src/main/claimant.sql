CREATE DATABASE IF NOT EXISTS claimant_db;
USE claimant_db;

CREATE TABLE claimant (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          full_name VARCHAR(255),
                          ssn VARCHAR(255),
                          income DOUBLE,
                          dependents INT,
                          is_eligible BOOLEAN
);
