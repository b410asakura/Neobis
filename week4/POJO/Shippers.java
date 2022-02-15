package com.company;

public class Shippers {
    private int shipperId;
    private String name;

    public Shippers(){}

    public Shippers(int shipperId, String name) {
        this.shipperId = shipperId;
        this.name = name;
    }

    public int getShipperId() {
        return shipperId;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
