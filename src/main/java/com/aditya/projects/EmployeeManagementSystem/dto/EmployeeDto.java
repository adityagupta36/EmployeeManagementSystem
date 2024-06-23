package com.aditya.projects.EmployeeManagementSystem.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {


    private Integer id;

    @NotEmpty(message = "Firstname should not be null and Empty")
    private String firstName;

    @NotEmpty(message = "Lastname should not be null and Empty")
    private String lastName;

    @NotEmpty(message = "Email should not be null and Empty")
    @Email(message = "Invalid email entered")
    private String emailId;

    @NotEmpty(message = "Mobile No. should not be null and Empty")
    @Pattern(regexp = "^\\d{10}$",message = "Invalid mobile number entered: shpuld be of 10 digits")
    private String mobileNo;

    @NotEmpty(message = "Age should not be null and Empty")
    @Min(value = 18,message = "Should be int the range of: min-> 18 and max->60")
    @Max(60)
    private Integer age;

    @NotEmpty(message = "Password should not be null and Empty")
    @Size(min = 6, max = 12, message = "Should be int the range of: min-> 6 and max->12 sequence of characters")
    private String password;

}
