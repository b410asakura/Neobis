package com.company;

public class TextileSellers {
    private int sellersId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;


    public TextileSellers() {
    }

    public TextileSellers(int sellersId, String firstName, String lastName, String email, String phoneNumber, String address) {
        this.sellersId = sellersId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getSellersId() {
        return sellersId;
    }

    public void setSellersId(int sellersId) {
        this.sellersId = sellersId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
