package com.Restaurant.Management.model;

public class Orders {


    private Long orderId;
    private String dishName;
    private Double Amount;
    private String status;


    public Orders(Long orderId, String dishName, Double Amount) {
        this.orderId = orderId;
        this.Amount = Amount;
        this.dishName = dishName;
        this.status = "Pending";
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" + "orderId =" + orderId + '\'' + "Dish name =" + dishName +
                '\'' + "Amount =" + Amount + '\'' + "status =" + status + "}";
    }
}
