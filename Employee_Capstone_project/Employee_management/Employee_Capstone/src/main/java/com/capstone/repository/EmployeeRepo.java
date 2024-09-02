package com.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {


}
