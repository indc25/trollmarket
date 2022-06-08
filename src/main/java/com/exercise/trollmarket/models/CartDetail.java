package com.exercise.trollmarket.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class CartDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CartDetailID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CartID", nullable = false)
    private Cart cartID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ProductID", nullable = false)
    private Product productID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ShipmentID", nullable = false)
    private Shipment shipmentID;

    @Column(name = "Quantity", nullable = false)
    private Integer quantity;

//    public CartDetail(Integer cartID, Integer productID, Integer shipmentID, Integer quantity) {
//        this.cartID = new Cart(cartID);
//        this.productID = new Product(productID);
//        this.shipmentID = new Shipment(shipmentID);
//        this.quantity = quantity;
//    }
}