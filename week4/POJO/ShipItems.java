package com.company;

public class ShipItems {
    private int shipItemsId;
    private int shipStatusesId;
    private int shipperId;
    private String shippedDate;

    public ShipItems(){}

    public ShipItems(int shipItemsId, int shipStatusesId, int shipperId, String shippedDate) {
        this.shipItemsId = shipItemsId;
        this.shipStatusesId = shipStatusesId;
        this.shipperId = shipperId;
        this.shippedDate = shippedDate;
    }

    public int getShipItemsId() {
        return shipItemsId;
    }

    public void setShipItemsId(int shipItemsId) {
        this.shipItemsId = shipItemsId;
    }

    public int getShipStatusesId() {
        return shipStatusesId;
    }

    public void setShipStatusesId(int shipStatusesId) {
        this.shipStatusesId = shipStatusesId;
    }

    public int getShipperId() {
        return shipperId;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }

    public String getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(String shippedDate) {
        this.shippedDate = shippedDate;
    }
}
