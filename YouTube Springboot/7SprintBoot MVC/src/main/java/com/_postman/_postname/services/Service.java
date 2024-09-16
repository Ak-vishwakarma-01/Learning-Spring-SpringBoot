package com._postman._postname.services;

import com._postman._postname.model.Product;

import java.util.*;

public class Service {
    List<Product> products = new ArrayList<>(
            Arrays.asList(new Product(234,"Samsunt",2345.0000),
                         new Product(234,"Samsunt",2345.0000),
                         new Product(234,"Samsunt",2345.0000)));

    public List<Product> getAllProducts(){
        return products;
    }
}
