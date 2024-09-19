package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // It will Generate Getter and Setter using lombok
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="employees")  // responsible to create table into database
//@Table(name="employees")
public class Employee {

    @Id
    @Column(name="emp_id")
    private int id;

    @Column(name="emp_name")
    private String name;

    @Column(name="emp_address")
    private String address;

    @Column(name="emp_sallary")
    private double salary;

}
