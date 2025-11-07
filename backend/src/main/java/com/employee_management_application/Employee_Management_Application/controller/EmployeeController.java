package com.employee_management_application.Employee_Management_Application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee_management_application.Employee_Management_Application.model.Employee;
import com.employee_management_application.Employee_Management_Application.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    // Inject the EmployeeService
    @Autowired
    private EmployeeRepository employeeRepository;

    // Define CRUD endpoints here
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return this.employeeRepository.findAll();
    }
}
