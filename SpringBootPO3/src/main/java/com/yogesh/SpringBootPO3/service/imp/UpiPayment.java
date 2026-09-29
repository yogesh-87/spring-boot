package com.yogesh.SpringBootPO3.service.imp;

import com.yogesh.SpringBootPO3.service.Payment;
import org.springframework.stereotype.Service;

@Service
public class UpiPayment implements Payment {

    @Override
    public String pay() {
        return "UPI";
    }
}
