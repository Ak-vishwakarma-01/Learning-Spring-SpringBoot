package com.example._howtouploadfile.Qualifire;

import org.springframework.stereotype.Service;

@Service("gpay")
public class CreditCardPayment implements Payment{

    public CreditCardPayment(){
        System.out.println("credit card constructor");
    }

    @Override
    public String processPayment() {
        return "credit card payment processing...";
    }
}
