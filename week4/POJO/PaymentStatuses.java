package com.company;

public class PaymentStatuses {
    private int paymentStatusID;
    private String name;

    public PaymentStatuses (){}

    public PaymentStatuses(int paymentStatusID, String name) {
        this.paymentStatusID = paymentStatusID;
        this.name = name;
    }

    public int getPaymentStatusID() {
        return paymentStatusID;
    }

    public void setPaymentStatusID(int paymentStatusID) {
        this.paymentStatusID = paymentStatusID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
