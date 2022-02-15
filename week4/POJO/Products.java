package com.company;

public class Products {
    private int productId;
    private String name;
    private int categoryId;
    private int sizeId;
    private int price;
    private int textileId;
    private int quantityInStock;


    public Products() {
    }

    public Products(int productId, String name, int categoryId, int sizeId, int price, int textileId, int quantityInStock) {
        this.productId = productId;
        this.name = name;
        this.categoryId = categoryId;
        this.sizeId = sizeId;
        this.price = price;
        this.textileId = textileId;
        this.quantityInStock = quantityInStock;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTextileId() {
        return textileId;
    }

    public void setTextileId(int textileId) {
        this.textileId = textileId;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
}
