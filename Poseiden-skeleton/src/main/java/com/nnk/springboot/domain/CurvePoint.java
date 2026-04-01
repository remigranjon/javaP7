package com.nnk.springboot.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "curvepoint")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CurvePoint {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @NotNull(message = "must not be null")
    @Positive(message = "must be positive")
    private Integer curveId;
    private Timestamp asOfDate;
    @Digits(integer = 10, fraction = 2, message = "must be a number with up to 10 digits and 2 decimal places")
    private BigDecimal term;
    @Digits(integer = 10, fraction = 2, message = "must be a number with up to 10 digits and 2 decimal places")
    private BigDecimal value;
    private Timestamp creationDate;

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CurvePoint [id=" + id + ", curveId=" + curveId + ", asOfDate=" + asOfDate + ", term=" + term
                + ", value=" + value + ", creationDate=" + creationDate + "]";
    }
}
