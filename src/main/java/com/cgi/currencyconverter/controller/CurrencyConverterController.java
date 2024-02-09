package com.cgi.currencyconverter.controller;

import com.cgi.currencyconverter.controller.errors.BadRequestAlertException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

import com.cgi.currencyconverter.dto.currency.CurrencyDTO;
import com.cgi.currencyconverter.service.CurrencyConverterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/currency-converter")
public class CurrencyConverterController {
    private final Logger log = LoggerFactory.getLogger(CurrencyConverterController.class);

    private static final String ENTITY_NAME = "currency";

    private final CurrencyConverterService currencyConverterService;

    public CurrencyConverterController(CurrencyConverterService currencyConverterService) {
        this.currencyConverterService = currencyConverterService;
    }

    @GetMapping("/currency-quotes")
    public String getCurrencyQuotes() {

        return currencyConverterService.getCurrencyQuotesList().toString();
    }

    @PostMapping("/save")
    public ResponseEntity createCurrency(@Valid @RequestBody CurrencyDTO currencyDTO) throws URISyntaxException {

        log.debug("REST request to save Currency : {}", currencyDTO);
        if (!currencyDTO.isNew()) {
            throw new BadRequestAlertException("A new Currency cannot already have an ID", ENTITY_NAME, "idexists");
        }

        CurrencyDTO result = currencyConverterService.createCCurrency(currencyDTO);
        return ResponseEntity.created(new URI("/api/client/" + result.getId())).body(result);
    }

}
