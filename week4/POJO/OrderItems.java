package com.company;

public class OrderItems {
    private int orderItemsId;
    private int productId;
    private int quantity;
    private String orderDate;
    private int orderStatusId;
    private int shipItemsId;
    private int paymentItemsId;

    public OrderItems(){}

    public OrderItems(int orderItemsId, int productId, int quantity, String orderDate, int orderStatusId, int shipItemsId, int paymentItemsId) {
        this.orderItemsId = orderItemsId;
        this.productId = productId;
        this.quantity = quantity;
        this.orderDate = orderDate;
        this.orderStatusId = orderStatusId;
        this.shipItemsId = shipItemsId;
        this.paymentItemsId = paymentItemsId;
    }

    public int getOrderItemsId() {
        return orderItemsId;
    }

    public void setOrderItemsId(int orderItemsId) {
        this.orderItemsId = orderItemsId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(int orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public int getShipItemsId() {
        return shipItemsId;
    }

    public void setShipItemsId(int shipItemsId) {
        this.shipItemsId = shipItemsId;
    }

    public int getPaymentItemsId() {
        return paymentItemsId;
    }

    public void setPaymentItemsId(int paymentItemsId) {
        this.paymentItemsId = paymentItemsId;
    }
}
