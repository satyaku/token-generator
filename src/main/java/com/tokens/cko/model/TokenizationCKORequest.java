package com.tokens.cko.model;

public class TokenizationCKORequest {

    private String type = "card";
    private String number;
    private int expiry_month;
    private int expiry_year;
    private String cvv;
    private String name;
    private BillingAddress billing_address;
    private Phone phone;

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

    public int getExpiry_month() {
        return expiry_month;
    }

    public void setExpiry_month(int expiry_month) {
        this.expiry_month = expiry_month;
    }

    public int getExpiry_year() {
        return expiry_year;
    }

    public void setExpiry_year(int expiry_year) {
        this.expiry_year = expiry_year;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BillingAddress getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(BillingAddress billing_address) {
        this.billing_address = billing_address;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "TokenizationCKORequest{" +
                "type='" + type + '\'' +
                ", number='" + number + '\'' +
                ", expiry_month=" + expiry_month +
                ", expiry_year=" + expiry_year +
                ", cvv='" + cvv + '\'' +
                ", name='" + name + '\'' +
                ", billing_address=" + billing_address +
                ", phone=" + phone +
                '}';
    }
}
