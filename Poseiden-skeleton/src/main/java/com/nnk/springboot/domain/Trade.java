package com.nnk.springboot.domain;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


@Entity
@Table(name = "trade")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Trade {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String account;
    private String type;
    private Double buyQuantity;
    private Double sellQuantity;
    private Double buyPrice;
    private Double sellPrice;
    private String benchmark;
    private Timestamp tradeDate;
    private String security;
    private String status;
    private String trader;
    private String book;
    private String creationName;
    private Timestamp creationDate;
    private String revisionName;
    private Timestamp revisionDate;
    private String dealName;
    private String dealType;
    private String sourceListId;
    private String side;

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Trade [id=" + id + ", account=" + account + ", type=" + type + ", buyQuantity=" + buyQuantity
                + ", sellQuantity=" + sellQuantity + ", buyPrice=" + buyPrice + ", sellPrice=" + sellPrice
                + ", benchmark=" + benchmark + ", tradeDate=" + tradeDate + ", security=" + security + ", status="
                + status + ", trader=" + trader + ", book=" + book + ", creationName=" + creationName
                + ", creationDate=" + creationDate + ", revisionName=" + revisionName + ", revisionDate=" + revisionDate
                + ", dealName=" + dealName + ", dealType=" + dealType + ", sourceListId=" + sourceListId + ", side="
                + side + "]";
    } 
}
