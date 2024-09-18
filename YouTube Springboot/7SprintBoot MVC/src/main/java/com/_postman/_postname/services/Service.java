package com._postman._postname.services;

import com._postman._postname.model.Product;

import java.util.*;

@org.springframework.stereotype.Service
public class Service {
    List<Product> products = new ArrayList<>(
            Arrays.asList(
                    new Product(101, "Samsung TV", 2345.00),
                    new Product(102, "Apple iPhone", 999.99),
                    new Product(103, "Sony PlayStation", 499.99)
            )
    );

    // Method to retrieve all products
    public List<Product> getAllProducts() {
        return products;
    }

    // Method to add a new product
    public void addProduct(Product product) {
        products.add(product);
    }
}
