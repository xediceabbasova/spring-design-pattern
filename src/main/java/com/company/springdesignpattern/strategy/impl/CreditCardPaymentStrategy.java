package com.company.springdesignpattern.strategy.impl;

import com.company.springdesignpattern.strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

@Service("creditCard")
public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public String pay(String orderId, Double amount, String paymentType) {
        return "Payment done with credit card for orderId: " + orderId + " amount: " + amount + " paymentType: " + paymentType;
    }
}
