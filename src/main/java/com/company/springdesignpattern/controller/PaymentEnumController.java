package com.company.springdesignpattern.controller;

import com.company.springdesignpattern.dto.PaymentRequest;
import com.company.springdesignpattern.enumfactory.PaymentEnumType;
import com.company.springdesignpattern.factory.PaymentFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/payment")
public class PaymentEnumController {

    @PostMapping
    public ResponseEntity<String> payment(@RequestBody PaymentRequest paymentRequest) {
        PaymentEnumType.getPaymentType(paymentRequest.paymentType()).output();
        return ResponseEntity.ok(PaymentEnumType.getPaymentType(paymentRequest.paymentType())
                .getPayment()
                .pay(paymentRequest.orderId(), paymentRequest.amount()));
    }
}
