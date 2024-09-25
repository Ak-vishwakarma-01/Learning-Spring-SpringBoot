package com.Crud.demo.repository;

import com.Crud.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRipository extends JpaRepository<Employee,Integer> {

}
