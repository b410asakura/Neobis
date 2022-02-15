package com.company;

public class EmployeePositions {
    private int positionId;
    private String name;

    public EmployeePositions(){}

    public EmployeePositions(int positionId, String name) {
        this.positionId = positionId;
        this.name = name;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
