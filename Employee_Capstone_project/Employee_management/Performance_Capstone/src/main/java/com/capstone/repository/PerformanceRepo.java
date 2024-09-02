package com.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.entity.Performance;

@Repository
public interface PerformanceRepo extends JpaRepository<Performance, Long> {
}
