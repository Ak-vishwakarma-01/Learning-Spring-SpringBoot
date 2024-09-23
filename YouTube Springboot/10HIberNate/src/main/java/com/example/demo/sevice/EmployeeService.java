package com.example.demo.sevice;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployRipository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService   {

    @Autowired //we can access methods of ER
    EmployRipository employRipository;

    // inserting data into the table with the condition;
    //orm-> object relational mapping
    public ResponseEmployee insertEmployee(Employee employee){
        if(employee.getSalary()>50000 && employee.getAddress().equals("pune")){
            Employee emp = employRipository.save(employee);
            return new ResponseEmployee(emp,"Employee saved success");
        }else {
//            throw new SalaryLessException("Your Salary is less than 50000");
              return new ResponseEmployee(null,"Salary should be GreaterThan 50000 and employ must be from pune");
        }
    }

// retriving data with table;
    public ResponseEmployee getEmployeeById(int id){
     Optional<Employee> employee = employRipository.findById(id);
     if(employee.isPresent()){
         return new ResponseEmployee(employee.get(),"This is the employee for which you are looking");
     }else{
         return  new ResponseEmployee(null,"Employee is not present in the list");
     }
    }

    public List<Employee> getSallaryBetween(double min,double max){
        System.out.println("Fetching employees with salary between " + min + " and " + max);
        List<Employee> employees = employRipository.findBySalaryBetween(min, max);
        System.out.println("Employees found: " + employees.size());
        return employees;
    }
    /*
    you're using an interface EmployRipository (which extends JpaRepository) to call methods like findBySallaryBetween(min, max)
    directly without explicitly implementing the interface. This is possible because of Spring Data JPA's capabilities.

    When you define a repository interface like EmployRipository, Spring Data JPA automatically provides implementations
    for common CRUD operations (save(), findById(), delete(), etc.) and also allows you to define custom query methods,
    such as findBySallaryBetween(double min, double max).

    This proxy object is injected into your service class (via @Autowired
    Spring Boot uses a technique called dependency injection along with proxy-based pattern.

    Automatic Query Method: Methods like findBySallaryBetween() are interpreted by Spring JPA
     */
}
