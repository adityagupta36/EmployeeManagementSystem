package com.aditya.projects.EmployeeManagementSystem.exceptions;

public class ResourceNotFoundException extends RuntimeException{


    public ResourceNotFoundException(String message){
        super(message); //super class constructor
    }
}
