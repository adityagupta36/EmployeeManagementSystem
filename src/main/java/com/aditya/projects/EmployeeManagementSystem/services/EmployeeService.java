package com.aditya.projects.EmployeeManagementSystem.services;

import com.aditya.projects.EmployeeManagementSystem.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    public EmployeeDto createEmployee(EmployeeDto employeeDto);

    public EmployeeDto getEmployeeById(Long id);

    public List<EmployeeDto> getAllEmployees();

    public EmployeeDto updateEmployeeDetails(Long id, EmployeeDto employeeDto);

    public void deleteEmployee(Long id);
}
