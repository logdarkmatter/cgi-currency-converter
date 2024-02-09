package com.cgi.currencyconverter.dto;

import org.springframework.data.annotation.ReadOnlyProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.UUID;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class BaseDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID id;

    public boolean isNew() {
        return id == null;
    }
}
