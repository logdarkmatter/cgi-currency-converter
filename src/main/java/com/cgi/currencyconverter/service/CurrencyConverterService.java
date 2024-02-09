package com.cgi.currencyconverter.service;

import com.cgi.currencyconverter.domain.CurrencyEntity;
import com.cgi.currencyconverter.dto.currency.CurrencyDTO;
import com.cgi.currencyconverter.repository.CurrencyRepository;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

import com.cgi.currencyconverter.util.HTTPHeaders;

@Service
public class CurrencyConverterService implements CurrencyConverterServiceImpl {


    // Create a RestTemplate for making HTTP requests
    private final RestTemplate restTemplate;

    private  final CurrencyRepository currencyRepository;

    public CurrencyConverterService(RestTemplateBuilder restTemplateBuilder, CurrencyRepository currencyRepository) {
        // Initialize the RestTemplate using RestTemplateBuilder
        this.restTemplate = restTemplateBuilder.build();
        this.currencyRepository = currencyRepository;
    }

    @Override
    public List<String> getCurrencyQuotesList() {
        try {
            HTTPHeaders headers =  new HTTPHeaders();
            HttpEntity entity = new HttpEntity(headers.createHeaders());
            // Make a GET request to the currency quotes API and deserialize the JSON response into a list of strings
             ResponseEntity<String> quotes = restTemplate.exchange("https://currency-exchange.p.rapidapi.com/listquotes", HttpMethod.GET, entity, String.class);
            return Arrays.asList(quotes.getBody().split(","));
        }catch (Exception e) {
            // Handle any exceptions that may occur (e.g., network issues or JSON parsing errors) and print an error message
            System.out.println("Error while fetching a currency quotes: " + e.getMessage());
        }
        return null;
    }

    @Override
    public CurrencyDTO createCCurrency(CurrencyDTO currencyDTO) {
        currencyRepository.save(new CurrencyEntity(currencyDTO));
        return new CurrencyDTO();
    }
}
