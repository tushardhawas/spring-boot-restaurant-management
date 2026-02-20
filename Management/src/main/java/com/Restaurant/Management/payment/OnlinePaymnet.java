package com.Restaurant.Management.payment;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class OnlinePaymnet implements Payment {
    @Override
    public String getPaymentType() {
        return "Online";
    }

    @Override
    public String paymentProcess(Double amount) {
        return "Online payment of RS " + amount + " Recived";
    }
    @PostConstruct
    public void init(){
        System.out.println("online bean created ");
    }

}
