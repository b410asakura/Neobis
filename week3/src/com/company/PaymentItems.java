package com.company;

public class PaymentItems {
    private int paymentItemsId;
    private int paymentStatusId;
    private float paymentTotal;
    private int customerId;
    private String dueDate;

    public PaymentItems(){}

    public PaymentItems(int paymentItemsId, int paymentStatusId, float paymentTotal, int customerId, String dueDate) {
        this.paymentItemsId = paymentItemsId;
        this.paymentStatusId = paymentStatusId;
        this.paymentTotal = paymentTotal;
        this.customerId = customerId;
        this.dueDate = dueDate;
    }

    public int getPaymentItemsId() {
        return paymentItemsId;
    }

    public void setPaymentItemsId(int paymentItemsId) {
        this.paymentItemsId = paymentItemsId;
    }

    public int getPaymentStatusId() {
        return paymentStatusId;
    }

    public void setPaymentStatusId(int paymentStatusId) {
        this.paymentStatusId = paymentStatusId;
    }

    public float getPaymentTotal() {
        return paymentTotal;
    }

    public void setPaymentTotal(float paymentTotal) {
        this.paymentTotal = paymentTotal;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
