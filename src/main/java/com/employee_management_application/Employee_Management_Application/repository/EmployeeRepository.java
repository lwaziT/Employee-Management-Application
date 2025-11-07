package com.employee_management_application.Employee_Management_Application.repository;

import com.employee_management_application.Employee_Management_Application.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
