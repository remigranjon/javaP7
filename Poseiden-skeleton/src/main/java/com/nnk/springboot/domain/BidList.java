package com.nnk.springboot.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "bidlist")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BidList {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer bidListId;
    @NotBlank(message = "Account is mandatory")
    private String account;
    @NotBlank(message = "Type is mandatory")
    private String type;
    private Double bidQuantity;
    private Double askQuantity;
    private Double bid;
    private Double ask;
    private String benchmark;
    private Timestamp bidListDate;
    private String commentary;
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

    public void setBidListId(Integer bidListId) {
    this.bidListId = bidListId;

    
}

    @Override
    public String toString() {
        return "BidList [bidListId=" + bidListId + ", account=" + account + ", type=" + type + ", bidQuantity="
                + bidQuantity + ", askQuantity=" + askQuantity + ", bid=" + bid + ", ask=" + ask + ", benchmark="
                + benchmark + ", bidListDate=" + bidListDate + ", commentary=" + commentary + ", security=" + security
                + ", status=" + status + ", trader=" + trader + ", book=" + book + ", creationName=" + creationName
                + ", creationDate=" + creationDate + ", revisionName=" + revisionName + ", revisionDate=" + revisionDate
                + ", dealName=" + dealName + ", dealType=" + dealType + ", sourceListId=" + sourceListId + ", side="
                + side + "]";
    }
}
