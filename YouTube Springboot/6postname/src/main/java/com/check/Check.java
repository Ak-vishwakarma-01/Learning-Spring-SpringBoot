package com.check;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Check {
    Check(){
        System.err.println("Check object is created");
    }
}
