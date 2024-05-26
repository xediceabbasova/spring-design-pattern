package com.company.springdesignpattern.enumfactory.impl;

import com.company.springdesignpattern.enumfactory.payment.Payment;
import org.springframework.stereotype.Service;

@Service
public class CreditCardPayment implements Payment {

    @Override
    public String pay(String orderId, Double amount) {
        return "Payment done using Credit Card in EnumType method";
    }
}
