package com.Restaurant.Management.payment;

public interface Payment {
    String paymentProcess(Double amount);
    String getPaymentType();
}
