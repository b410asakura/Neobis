package com.company;

public class Textile {
    private int textileId;
    private int colorId;
    private float price;
    private float footage;
    private int sellerId;

    public Textile(){}

    public Textile(int textileId, int colorId, float price, float footage, int sellerId) {
        this.textileId = textileId;
        this.colorId = colorId;
        this.price = price;
        this.footage = footage;
        this.sellerId = sellerId;
    }

    public int getTextileId() {
        return textileId;
    }

    public void setTextileId(int textileId) {
        this.textileId = textileId;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getFootage() {
        return footage;
    }

    public void setFootage(float footage) {
        this.footage = footage;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }
}
