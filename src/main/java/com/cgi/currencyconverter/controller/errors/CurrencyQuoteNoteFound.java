package com.cgi.currencyconverter.controller.errors;

import lombok.AllArgsConstructor;

public class CurrencyQuoteNoteFound extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private CurrencyConverterErrorsEnum currencyConverterErrorsEnum;

    public CurrencyQuoteNoteFound(CurrencyConverterErrorsEnum errorCode) {
        super(errorCode.getDescription());
        this.currencyConverterErrorsEnum = errorCode;
    }

    public CurrencyConverterErrorsEnum getErrorCode() {
        return currencyConverterErrorsEnum;
    }
}
