package com.company.springdesignpattern.controller;

import com.company.springdesignpattern.dto.PaymentRequest;
import com.company.springdesignpattern.factory.PaymentFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/payment")
public class PaymentController {

    private final PaymentFactory paymentFactory;

    public PaymentController(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    @PostMapping
    public ResponseEntity<String> payment(@RequestBody PaymentRequest paymentRequest) {
        return ResponseEntity.ok(paymentFactory.executePayment(paymentRequest));
    }


}
