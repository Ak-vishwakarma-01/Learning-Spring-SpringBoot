package com.Crud.demo.Controller;

import com.Crud.demo.entity.Employee;
import com.Crud.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employees")
public class EmployeController {
    @Autowired
    private EmployeeService employeeService;

    // Display the list of employees
    @GetMapping
    public String getAllEmployees(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "index";  // Make sure index.jsp exists under WEB-INF/views/
    }
    // Show form to create a new employee
    @GetMapping("/new")
    public String showCreateEmployeeForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new_employee";  // returns to new_employee.jsp
    }

    // Save a new employee
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }

    // Show form to update an existing employee
    @GetMapping("/update/{id}")
    public String showUpdateEmployeeForm(@PathVariable int id, Model model) {
        Optional<Employee> employee = employeeService.getEmployeeById(id);
        employee.ifPresent(value -> model.addAttribute("employee", value));
        return "update_employee";  // returns to update_employee.jsp
    }

    // Update an employee
    @PostMapping("/update/{id}")
    public String updateEmployee(@PathVariable int id, @ModelAttribute("employee") Employee employee) {
        employeeService.updateEmployee(employee);
        return "redirect:/employees";
    }

    // Delete an employee
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployeeById(id);
        return "redirect:/employees";
    }
}
