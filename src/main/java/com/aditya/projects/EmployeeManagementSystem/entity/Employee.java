package com.aditya.projects.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.*;

//@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id  //make primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //primary key identity
    private long id;


    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "EmailId")
    private String emailId;

}