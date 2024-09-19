package com.example.demo.sevice;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployRipository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService   {

    @Autowired //we can access methods of ER
    EmployRipository employRipository;

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
}
