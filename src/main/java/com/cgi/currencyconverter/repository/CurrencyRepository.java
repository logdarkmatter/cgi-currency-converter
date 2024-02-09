package com.cgi.currencyconverter.repository;

import com.cgi.currencyconverter.domain.CurrencyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Currency;

@Repository
public interface  CurrencyRepository  extends JpaRepository<CurrencyEntity, Long> {
}
