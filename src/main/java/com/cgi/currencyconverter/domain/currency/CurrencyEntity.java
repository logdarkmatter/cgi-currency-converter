package com.cgi.currencyconverter.domain.currency;

import com.cgi.currencyconverter.domain.common.BaseEntityAudit;
import com.cgi.currencyconverter.dto.currency.CurrencyDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Entity
@Table(name = "currency")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CurrencyEntity extends BaseEntityAudit {
    private static final long serialVersionUID = 1L;

    public CurrencyEntity(CurrencyDTO currencyDTO) {
        setName(currencyDTO.getName());
        setCode(currencyDTO.getCode());
        setRate(currencyDTO.getRate());
    }

    private String name;
    private String code;
    private BigDecimal rate;

}
