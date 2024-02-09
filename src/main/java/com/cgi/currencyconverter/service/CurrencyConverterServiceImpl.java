package com.cgi.currencyconverter.service;

import com.cgi.currencyconverter.dto.currency.CurrencyDTO;

import java.util.List;
import java.util.Optional;

public interface CurrencyConverterServiceImpl {

    List<String> getCurrencyQuotesList();

    CurrencyDTO createCCurrency(CurrencyDTO currencyDTO);
}
