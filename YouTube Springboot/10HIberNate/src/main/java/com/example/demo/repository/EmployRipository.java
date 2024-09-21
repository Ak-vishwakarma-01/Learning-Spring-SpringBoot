package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployRipository extends JpaRepository<Employee,Integer> { //this repository will give so many methods insert-> save(), update-> updata(), get->final(),FindById(), delete->delete()
                                                    //Table.name, DataType of Id
}
