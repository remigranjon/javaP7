package com.nnk.springboot.domain;

import java.sql.Timestamp;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
    @NotBlank(message = "must not be null")
    private Integer curveId;
    private Timestamp asOfDate;
    private Double term;
    private Double value;
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
