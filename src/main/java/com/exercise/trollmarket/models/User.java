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
@Table(name = "\"User\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RoleID", nullable = false)
    private Role roleID;

    @Column(name = "Username", nullable = false, length = 50)
    private String username;

    @Column(name = "Password", nullable = false, length = 150)
    private String password;

    @OneToMany(mappedBy = "buyerID")
    private Set<TransactionHistory> transactionHistories = new LinkedHashSet<>();

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
    private Profile profile;

    @OneToMany(mappedBy = "sellerID")
    private Set<Product> products = new LinkedHashSet<>();

    @OneToMany(mappedBy = "buyerID")
    private Set<Cart> carts = new LinkedHashSet<>();

}