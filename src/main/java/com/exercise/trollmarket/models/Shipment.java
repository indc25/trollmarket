package com.exercise.trollmarket.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ShipmentID", nullable = false)
    private Integer id;

    @Column(name = "ShipmentName", nullable = false, length = 50)
    private String shipmentName;

    @Column(name = "Price", nullable = false, precision = 19, scale = 4)
    private BigDecimal price;

    @Column(name = "IsActive", nullable = false)
    private Boolean isActive = false;

    @OneToMany(mappedBy = "shipmentID")
    private Set<CartDetail> cartDetails = new LinkedHashSet<>();

}