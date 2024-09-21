package com.example.demo.sevice;

import com.example.demo.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseEmployee {
        private Employee employee;
        private String message;

}
