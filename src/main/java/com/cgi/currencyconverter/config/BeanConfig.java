package com.cgi.currencyconverter.config;

import com.cgi.currencyconverter.CurrencyConverterApplicationConstants;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { CurrencyConverterApplicationConstants.ANNOTATION_CONFIG_PACKAGE })
public class BeanConfig {

}
