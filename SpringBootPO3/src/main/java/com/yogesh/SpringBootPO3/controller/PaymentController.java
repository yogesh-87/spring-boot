package com.yogesh.SpringBootPO3.controller;


import com.yogesh.SpringBootPO3.service.Payment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phonePay")
public class PaymentController {

    @Value("${app.institute.name}")
   private String instituteName;

    private final Payment payment;

//    public PaymentController(Payment payment) {
//        this.payment = payment;
//    }

public PaymentController(@Qualifier("upiPayment") Payment payment) {
    this.payment = payment;
}


    @GetMapping("/pay")
    public String pay()
    {
       System.out.println(instituteName);
        return payment.pay();
    }

    @GetMapping("/instituteName")
    public String getInstituteName(){
    return instituteName;
    }
}
