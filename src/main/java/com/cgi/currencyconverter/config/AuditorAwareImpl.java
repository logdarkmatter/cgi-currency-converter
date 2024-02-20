package com.cgi.currencyconverter.config;

import com.cgi.currencyconverter.CurrencyConverterApplicationConstants;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(CurrencyConverterApplicationConstants.ANONYMOUS_USER);
    }
}
