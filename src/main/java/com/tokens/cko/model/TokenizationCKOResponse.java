package com.tokens.cko.model;

public class TokenizationCKOResponse {

    private String type;
    private String token;
    private String expires_on;
    private int expiry_month;
    private int expiry_year;
    private String scheme;
    private String last4;
    private String bin;
    private String card_type;
    private String card_category;
    private String issuer;
    private String issuer_country;
    private String product_id;
    private String product_type;
    private String name;
    private String billing_address;
    private String phone;
    private String card_number;

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExpires_on() {
        return expires_on;
    }

    public void setExpires_on(String expires_on) {
        this.expires_on = expires_on;
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

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getLast4() {
        return last4;
    }

    public void setLast4(String last4) {
        this.last4 = last4;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public String getCard_category() {
        return card_category;
    }

    public void setCard_category(String card_category) {
        this.card_category = card_category;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getIssuer_country() {
        return issuer_country;
    }

    public void setIssuer_country(String issuer_country) {
        this.issuer_country = issuer_country;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(String billing_address) {
        this.billing_address = billing_address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "TokenizationCKOResponse{" +
                "type='" + type + '\'' +
                ", token='" + token + '\'' +
                ", expires_on='" + expires_on + '\'' +
                ", expiry_month=" + expiry_month +
                ", expiry_year=" + expiry_year +
                ", scheme='" + scheme + '\'' +
                ", last4='" + last4 + '\'' +
                ", bin='" + bin + '\'' +
                ", card_type='" + card_type + '\'' +
                ", card_category='" + card_category + '\'' +
                ", issuer='" + issuer + '\'' +
                ", issuer_country='" + issuer_country + '\'' +
                ", product_id='" + product_id + '\'' +
                ", product_type='" + product_type + '\'' +
                ", name='" + name + '\'' +
                ", billing_address=" + billing_address +
                ", phone=" + phone +
                '}';
    }
}
