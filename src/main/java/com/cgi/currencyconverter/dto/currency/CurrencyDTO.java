package com.cgi.currencyconverter.dto.currency;

import com.cgi.currencyconverter.dto.BaseDTO;
import com.cgi.currencyconverter.dto.audit.BaseAuditDTO;
import lombok.*;

import java.math.BigDecimal;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CurrencyDTO extends BaseAuditDTO {
    private static final long serialVersionUID = 1L;

    private String name;
    private String code;
    private BigDecimal rate;
}
