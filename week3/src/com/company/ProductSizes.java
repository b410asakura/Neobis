package com.company;

public class ProductSizes {
    private int sizeId;
    private String name;

    public ProductSizes(){}

    public ProductSizes(int sizeId, String name) {
        this.sizeId = sizeId;
        this.name = name;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
