package com.cgi.currencyconverter.dto.currency;

import com.cgi.currencyconverter.domain.currency.CurrencyEntity;
import com.cgi.currencyconverter.dto.common.BaseAuditDTO;
import lombok.*;

import java.math.BigDecimal;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CurrencyDTO extends BaseAuditDTO {
    private static final long serialVersionUID = 1L;

    public CurrencyDTO(CurrencyEntity currencyEntity) {
        setId(currencyEntity.getId());
        setName(currencyEntity.getName());
        setCode(currencyEntity.getCode());
        setRate(currencyEntity.getRate());
        setCreatedBy(currencyEntity.getCreatedBy());
        setCreatedAt(currencyEntity.getCreatedAt());
        setUpdatedBy(currencyEntity.getUpdatedBy());
        setUpdatedAt(currencyEntity.getUpdatedAt());
    }

    private String name;
    private String code;
    private BigDecimal rate;
}
