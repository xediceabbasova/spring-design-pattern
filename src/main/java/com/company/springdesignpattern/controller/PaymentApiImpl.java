package com.company.springdesignpattern.controller;

import com.company.springdesignpattern.enumfactory.PaymentEnumType;
import com.company.springdesignpattern.gen.api.PaymentApi;
import com.company.springdesignpattern.gen.model.PaymentRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentApiImpl implements PaymentApi {

    @Override
    public ResponseEntity<String> payment(PaymentRequest paymentRequest) {
        return ResponseEntity.ok(PaymentEnumType.getPaymentType(paymentRequest.getPaymentType())
                .getPayment()
                .pay(paymentRequest.getOrderId(), paymentRequest.getAmount().doubleValue()));

    }
}
