package com.Restaurant.Management.controller;

import com.Restaurant.Management.model.Orders;
import com.Restaurant.Management.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
        System.out.println("Orderservice initialize ");
    }
    @GetMapping("/{id}")
    public Orders getOrders(@PathVariable Long id){
        return orderService.getOrder(id);
    }
    @GetMapping
    public Map<Long, Orders> getAllOrders() {
        return orderService.getAllOrders();
    }
    @PostMapping
    public Orders createOrder(@RequestParam String dishName, @RequestParam Double amount) {
        return orderService.createOrder(dishName, amount);
    }
    @PostMapping("/{id}/pay")
    public String payForOrder(@PathVariable Long id) {
        return orderService.processOrderPayment(id);
    }
}
