package com.sampleproject.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.sampleproject.demo.model.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer> {
    // You can add custom queries or methods here if needed
}

