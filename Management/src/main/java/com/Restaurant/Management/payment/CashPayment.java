package com.Restaurant.Management.payment;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
@Lazy
public class CashPayment implements Payment {


    @Override
    public String getPaymentType() {
        return "Cash";
    }

    @Override
    public String paymentProcess(Double amount) {
        return "Cash payment of RS " + amount + " Recived";
    }

    @PostConstruct
    public void init(){
        System.out.println("cash bean created ");
    }
}
