package com.company;

public class Orders {
    private int orderId;
    private int customerId;
    private int orderItemId;

    public Orders(){}

    public Orders(int orderId, int customerId, int orderItemId) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderItemId = orderItemId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }
}
