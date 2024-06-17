package com.aditya.projects.EmployeeManagementSystem.mapper;

import com.aditya.projects.EmployeeManagementSystem.dto.EmployeeDto;
import com.aditya.projects.EmployeeManagementSystem.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){

        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmailId()
        );

    }


    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmailId()
        );

    }
}
