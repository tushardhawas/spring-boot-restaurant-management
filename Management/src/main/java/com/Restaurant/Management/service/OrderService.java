package com.Restaurant.Management.service;

import com.Restaurant.Management.model.Orders;
import com.Restaurant.Management.payment.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderService {

    @Autowired

    private Payment paymentType;

    private Map<Long, Orders> orders = new HashMap<>();
    private long ordercount = 1l;


    public Orders createOrder(String dishname, Double amount) {
        Orders first = new Orders(ordercount++, dishname, amount);
        orders.put(first.getOrderId(), first);
        System.out.println("order ceated");
        return first;
    }

    public Orders getOrder(Long orderId) {
        return orders.get(orderId);
    }

    public String processOrderPayment(Long orderId) {
        Orders order = orders.get(orderId);
        if (order == null) {
            return "No order placed";
        }

        String paymentResult = paymentType.paymentProcess(order.getAmount());
        order.setStatus("paid");

        return paymentResult + " | Order #" + orderId + " is now " + order.getStatus();
    }

    public Map<Long, Orders> getAllOrders() {
        return orders;
    }


}
