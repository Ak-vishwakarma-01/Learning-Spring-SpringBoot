package com.example._howtouploadfile.Qualifire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PymentConroller {
    @Qualifier("gpay") // now it will call appropriate method
    @Autowired //without qualifier : PymentConroller required a single bean, but 2 were found: because two class is implementing Payment
    Payment payment;

    @GetMapping("payment")
    public String processing(){
        System.out.println("Controller Payment is procesing");
        return payment.processPayment();
    }

}
