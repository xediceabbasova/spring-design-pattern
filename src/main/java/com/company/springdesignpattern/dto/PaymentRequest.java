package com.company.springdesignpattern.dto;

public record PaymentRequest(
        String orderId,
        Double amount,
        String paymentType
) {
}
