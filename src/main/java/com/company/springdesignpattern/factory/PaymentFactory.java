package com.company.springdesignpattern.factory;

import com.company.springdesignpattern.dto.PaymentRequest;

public interface PaymentFactory {

    String executePayment(PaymentRequest paymentRequest);

}
