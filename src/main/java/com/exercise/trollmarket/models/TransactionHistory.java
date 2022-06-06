package com.exercise.trollmarket.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class TransactionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TransactionID", nullable = false)
    private Integer id;

    @Column(name = "TransactionDate", nullable = false)
    private Instant transactionDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BuyerID", nullable = false)
    private User buyerID;

    @Column(name = "SellerName", length = 50)
    private String sellerName;

    @Column(name = "ProductName", length = 100)
    private String productName;

    @Column(name = "ShipmentName", length = 50)
    private String shipmentName;

    @Column(name = "Quantity", nullable = false)
    private Integer quantity;

    @Column(name = "TotalPrice", nullable = false, precision = 19, scale = 4)
    private BigDecimal totalPrice;

}