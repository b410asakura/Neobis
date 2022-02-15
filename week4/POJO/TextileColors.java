package com.company;

public class TextileColors {
    private int colorId;
    private String name;

    public TextileColors(){}

    public TextileColors(int colorId, String name) {
        this.colorId = colorId;
        this.name = name;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
