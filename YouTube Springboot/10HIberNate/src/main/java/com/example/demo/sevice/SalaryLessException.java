package com.example.demo.sevice;

public class SalaryLessException extends RuntimeException {
    public SalaryLessException(String message) {
        super(message);
    }
}
