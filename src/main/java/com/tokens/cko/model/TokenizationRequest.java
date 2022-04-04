package com.tokens.cko.model;

public class TokenizationRequest {

    private String type = "card";
    private String number;
    private String expiry_month;
    private String expiry_year;
    private String cvv;
    private String name;
    private BillingAddress address;
    private Phone phone;

    public TokenizationRequest() {
    }

    public TokenizationRequest(String type, String number, String expiry_month, String expiry_year, String cvv, String name, BillingAddress address, Phone phone) {
        this.type = type;
        this.number = number;
        this.expiry_month = expiry_month;
        this.expiry_year = expiry_year;
        this.cvv = cvv;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpiry_month() {
        return expiry_month;
    }

    public void setExpiry_month(String expiry_month) {
        this.expiry_month = expiry_month;
    }

    public String getExpiry_year() {
        return expiry_year;
    }

    public void setExpiry_year(String expiry_year) {
        this.expiry_year = expiry_year;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public BillingAddress getAddress() {
        return address;
    }

    public void setAddress(BillingAddress address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TokenizationRequest{" +
                "type='" + type + '\'' +
                ", number='" + number + '\'' +
                ", expiry_month=" + expiry_month +
                ", expiry_year=" + expiry_year +
                ", cvv='" + cvv + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", phone=" + phone +
                '}';
    }
}
