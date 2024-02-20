package com.cgi.currencyconverter.dto.common;

import lombok.*;
import org.springframework.data.annotation.ReadOnlyProperty;

import java.io.Serializable;
import java.time.Instant;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class BaseAuditDTO extends BaseDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ReadOnlyProperty
    private String createdBy;
    private Instant createdAt = Instant.now();
    @ReadOnlyProperty
    private String updatedBy;
    private Instant updatedAt = Instant.now();

}
