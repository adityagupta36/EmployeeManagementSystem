package com.aditya.projects.EmployeeManagementSystem.services;

import com.aditya.projects.EmployeeManagementSystem.dto.EmployeeDto;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.List;

public interface EmployeeService {

    public EmployeeDto createEmployee(EmployeeDto employeeDto) ;

    public EmployeeDto getEmployeeById(Integer id);

    public List<EmployeeDto> getAllEmployees();

    public EmployeeDto updateEmployeeDetails(Integer id, EmployeeDto employeeDto) ;

    public void deleteEmployee(Integer id);
}
