package com.cgi.currencyconverter.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Arrays;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HTTPHeaders {

    @Value("${rapidapi.host}")
    private String rapidapiHost;

    @Value("${rapidapi.key}")
    private String rapidapiKey;

    // Create headers for the HTTP request
    public HttpHeaders createHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("x-rapidapi-key", rapidapiKey);
        headers.set("x-rapidapi-host", rapidapiHost);
        return headers;
    }
}
