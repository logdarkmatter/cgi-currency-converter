package com.cgi.currencyconverter.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CurrencyConverterService implements CurrencyConverterServiceImpl {

    @Value("${rapidapi.host}")
    private String rapidapiHost;

    @Value("${rapidapi.key}")
    private String rapidapiKey;

    // Create a RestTemplate for making HTTP requests
    private final RestTemplate restTemplate;

    public CurrencyConverterService(RestTemplateBuilder restTemplateBuilder) {
        // Initialize the RestTemplate using RestTemplateBuilder
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public List<String> getCurrencyQuotesList() {
        try {
            HttpEntity entity = new HttpEntity(createHeaders());
            // Make a GET request to the currency quotes API and deserialize the JSON response into a list of strings
             ResponseEntity<String> quotes = restTemplate.exchange("https://currency-exchange.p.rapidapi.com/listquotes", HttpMethod.GET, entity, String.class);
            return Arrays.asList(quotes.getBody().split(","));
        }catch (Exception e) {
            // Handle any exceptions that may occur (e.g., network issues or JSON parsing errors) and print an error message
            System.out.println("Error while fetching a currency quotes: " + e.getMessage());
        }
        return null;
    }

    // Create headers for the HTTP request
    private HttpHeaders createHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("x-rapidapi-key", rapidapiKey);
        headers.set("x-rapidapi-host", rapidapiHost);
        return headers;
    }
}
