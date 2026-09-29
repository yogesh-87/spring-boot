package com.yogesh.SpringBootPO3.service.imp;

import com.yogesh.SpringBootPO3.service.Payment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CardPayment implements Payment {

    @Override
    public String pay() {
        return "CARD";
    }
}
