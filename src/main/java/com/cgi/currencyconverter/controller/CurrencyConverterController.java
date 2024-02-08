package com.cgi.currencyconverter.controller;

import com.cgi.currencyconverter.service.CurrencyConverterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConverterController {

    private final CurrencyConverterService currencyConverterService;

    public CurrencyConverterController(CurrencyConverterService currencyConverterService) {
        this.currencyConverterService = currencyConverterService;
    }

    @GetMapping("/currency-quotes")
    public String getCurrencyQuotes() {
        return currencyConverterService.getCurrencyQuotesList().toString();
    }
}
