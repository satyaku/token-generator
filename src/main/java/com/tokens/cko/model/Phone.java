package com.tokens.cko.model;

public class Phone {
    private String country_code;
    private String number;

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "country_code='" + country_code + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
