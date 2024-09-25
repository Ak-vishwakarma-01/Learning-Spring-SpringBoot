package com.Crud.demo.service;

import com.Crud.demo.entity.Employee;
import com.Crud.demo.repository.EmployeeRipository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRipository employeeRipository;

    // Create a new employee
    public Employee saveEmployee(Employee employee) {
        return employeeRipository.save(employee);
    }

    // Read all employees
    public List<Employee> getAllEmployees() {
        return employeeRipository.findAll();
    }

    // Read an employee by ID
    public Optional<Employee> getEmployeeById(int id) {
        return employeeRipository.findById(id);
    }

    // Update an existing employee
    public Employee updateEmployee(Employee employee) {
        return employeeRipository.save(employee);
    }

    // Delete an employee by ID
    public void deleteEmployeeById(int id) {
        employeeRipository.deleteById(id);
    }
}
