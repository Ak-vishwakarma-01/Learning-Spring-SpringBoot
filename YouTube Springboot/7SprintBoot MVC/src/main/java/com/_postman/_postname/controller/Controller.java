package com._postman._postname.controller;

import com._postman._postname.services.Service;
import com._postman._postname.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    Service service;

    @GetMapping("/products")
    public String productList(Model model){
        model.addAttribute("products",service.getAllProducts());
        return "products"; // view name / ui html file name
        /*

        */
    }
}
