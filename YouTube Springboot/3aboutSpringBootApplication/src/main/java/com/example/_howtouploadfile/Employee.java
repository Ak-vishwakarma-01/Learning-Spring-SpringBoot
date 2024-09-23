package com.example._howtouploadfile;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
    @Value("3245")
    int id;

    @Value("Name hai")
    String name;

    @Value("pata ba hamar")
    String  address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Employee(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
