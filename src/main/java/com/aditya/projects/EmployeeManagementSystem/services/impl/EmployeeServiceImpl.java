package com.aditya.projects.EmployeeManagementSystem.services.impl;

import com.aditya.projects.EmployeeManagementSystem.dto.EmployeeDto;
import com.aditya.projects.EmployeeManagementSystem.entity.Employee;
import com.aditya.projects.EmployeeManagementSystem.exceptions.ResourceNotFoundException;
import com.aditya.projects.EmployeeManagementSystem.mapper.EmployeeMapper;
import com.aditya.projects.EmployeeManagementSystem.repository.EmployeeRep;
import com.aditya.projects.EmployeeManagementSystem.services.EmployeeService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRep repo;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto)  {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        repo.save(employee);

        EmployeeDto employeeDto1 = EmployeeMapper.mapToEmployeeDto(employee);
        return employeeDto1;
    }

    @Override
    public EmployeeDto getEmployeeById(Integer id) {
        Employee employee = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee not exist with given id: " + id));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employeeList = repo.findAll();

        //VIMP
        //mapping List<Employee> to List<EmployeeDto>
        return employeeList.stream().map((employee)->EmployeeMapper.mapToEmployeeDto(employee)).collect(Collectors.toList());
    }

    @Override
    public EmployeeDto updateEmployeeDetails(Integer id,EmployeeDto employeeDto) {
        Employee employee = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not exist with given id: " + id));
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setEmailId(employeeDto.getEmailId());
        repo.save(employee);
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        Employee employee = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not exist with given id: " + id));
        repo.deleteById(id);
    }
}
