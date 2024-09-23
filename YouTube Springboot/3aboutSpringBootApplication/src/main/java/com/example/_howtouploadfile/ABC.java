package com.example._howtouploadfile;

import org.springframework.stereotype.Component;

//If I make it RestController or Controller or Repository then also it will be scanned
@Component // giving this class to the SB , first this class will be run then after student and employee
public class ABC {
    public ABC(){
        System.err.println("class ABC");
    }
}
