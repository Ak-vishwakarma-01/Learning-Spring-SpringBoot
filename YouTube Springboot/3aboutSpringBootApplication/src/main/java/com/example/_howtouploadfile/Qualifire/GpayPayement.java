package com.example._howtouploadfile.Qualifire;

import org.springframework.stereotype.Service;

@Service()
public class GpayPayement implements Payment{

    public GpayPayement(){
        System.out.println("GpayPayment Constructor");
    }

    @Override
    public String processPayment() {
        return "Gpay Payment is processing";
    }
}
