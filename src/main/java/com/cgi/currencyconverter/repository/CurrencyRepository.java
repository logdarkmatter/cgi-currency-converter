package com.cgi.currencyconverter.repository;

import com.cgi.currencyconverter.domain.currency.CurrencyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<CurrencyEntity, Long> {
}
