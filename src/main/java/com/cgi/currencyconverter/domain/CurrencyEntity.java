package com.cgi.currencyconverter.domain;

import com.cgi.currencyconverter.common.entity.BaseEntityAudit;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "currency")
@Data
@ToString
public class CurrencyEntity extends BaseEntityAudit {

    private String name;
    private String code;
    private double rate;

}
