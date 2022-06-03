package com.exercise.trollmarket.models;

import lombok.*;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CartID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BuyerID", nullable = false)
    private User buyerID;

    @OneToMany(mappedBy = "cartID")
    private Set<CartDetail> cartDetails = new LinkedHashSet<>();

}