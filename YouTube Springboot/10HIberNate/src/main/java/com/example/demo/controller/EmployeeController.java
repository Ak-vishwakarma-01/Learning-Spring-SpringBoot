package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.sevice.EmployeeService;
import com.example.demo.sevice.ResponseEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    /*
    {
    // inside boyd we have to use the original name of variable not given name of tables
    "id":102,
    "name":"ankdsfit",
    "address":"reh skta hu khi",
    "salary":2345634
    }
     */
    @PostMapping("/employee")
    public ResponseEmployee inset(@RequestBody  Employee employee){
        return employeeService.insertEmployee(employee);
    }
}
