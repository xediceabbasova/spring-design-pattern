package com.company.springdesignpattern.enumfactory;

import com.company.springdesignpattern.enumfactory.impl.CreditCardPayment;
import com.company.springdesignpattern.enumfactory.impl.WireTransferPayment;
import com.company.springdesignpattern.enumfactory.payment.Payment;

public enum PaymentEnumType {

    CREDIT_CARD("creditCard", new CreditCardPayment()) {
        @Override
        public void output() {
            System.out.println("Payment type: CREDIT_CARD");
        }
    },

    WIRE_TRANSFER("wireTransfer", new WireTransferPayment()) {
        @Override
        public void output() {
            System.out.println("Payment type: WIRE_TRANSFER");
        }
    };

    private final String value;
    private final Payment payment;

    PaymentEnumType(String value, Payment payment) {
        this.value = value;
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }

    public String getValue() {
        return value;
    }

    public static PaymentEnumType getPaymentType(String name) {
        for (PaymentEnumType paymentEnumType : PaymentEnumType.values()) {
            if (paymentEnumType.getValue().equals(name)) {
                return paymentEnumType;
            }
        }
        throw new IllegalArgumentException("Invalid payment type: " + name);
    }

    abstract public void output();
}
