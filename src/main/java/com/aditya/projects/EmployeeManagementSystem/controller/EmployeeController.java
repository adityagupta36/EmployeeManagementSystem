package com.aditya.projects.EmployeeManagementSystem.controller;

import com.aditya.projects.EmployeeManagementSystem.dto.EmployeeDto;
import com.aditya.projects.EmployeeManagementSystem.services.impl.EmployeeServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
       EmployeeDto employeeDto1 =  employeeService.createEmployee(employeeDto);
//       return ResponseEntity.status(HttpStatus.CREATED).body(employeeDto1);
       return new ResponseEntity<>(employeeDto1, HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id) {
       EmployeeDto employeeDto =  employeeService.getEmployeeById(id);
       return ResponseEntity.ok(employeeDto);
    }


    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        List<EmployeeDto> employeeDtoList = employeeService.getAllEmployees();
        return ResponseEntity.ok(employeeDtoList);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeeDto> updateEmployeeDetails(@PathVariable Long id, @RequestBody EmployeeDto employeeDto) {
        EmployeeDto employeeDto1 =  employeeService.updateEmployeeDetails(id, employeeDto);
        return ResponseEntity.ok(employeeDto1);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok("Employee Deleted! Suceessfully");
    }
}
