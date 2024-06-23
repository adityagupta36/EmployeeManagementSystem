package com.aditya.projects.EmployeeManagementSystem.mapper;

import com.aditya.projects.EmployeeManagementSystem.dto.EmployeeDto;
import com.aditya.projects.EmployeeManagementSystem.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){

        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmailId(),
                employee.getMobileNo(),
                employee.getAge(),
                employee.getPassword()
        );

    }


    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmailId(),
                employeeDto.getMobileNo(),
                employeeDto.getAge(),
                employeeDto.getPassword()
        );

    }
}
