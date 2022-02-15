package com.company;

public class ShipStatuses {
    private int shipStatusId;
    private String name;

    public ShipStatuses(){}

    public ShipStatuses(int shipStatusId, String name) {
        this.shipStatusId = shipStatusId;
        this.name = name;
    }

    public int getShipStatusId() {
        return shipStatusId;
    }

    public void setShipStatusId(int shipStatusId) {
        this.shipStatusId = shipStatusId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
