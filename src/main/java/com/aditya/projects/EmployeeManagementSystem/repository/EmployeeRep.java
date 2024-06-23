package com.aditya.projects.EmployeeManagementSystem.repository;

import com.aditya.projects.EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRep extends JpaRepository<Employee,Integer> {
}
