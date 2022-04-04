package com.tokens.cko.model;


public class CardData {

    private String card_number;
    private String expiry_month;
    private String expiry_year;
    private String cvv;
    private String type;
    private String description;

    public CardData() {
    }

    public CardData(String card_number, String expiry_month, String expiry_year, String cvv, String type, String description) {
        this.card_number = card_number;
        this.expiry_month = expiry_month;
        this.expiry_year = expiry_year;
        this.cvv = cvv;
        this.type = type;
        this.description = description;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
