package com.company.springdesignpattern.strategy;

public interface PaymentStrategy {

    String pay(String orderId, Double amount, String paymentType);

}
