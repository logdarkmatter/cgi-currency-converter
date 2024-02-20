package com.cgi.currencyconverter.controller.errors;

public enum CurrencyConverterErrorsEnum {

    ERR001_INVALID_QUOTE("ERR001", "ERR001 - Quote is invalid. It does not exist");

    private final String code;
    private final String description;

    CurrencyConverterErrorsEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
