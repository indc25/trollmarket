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
    @Column(name = "Username", nullable = false, length = 50)
    private String id;

    @Column(name = "Password", nullable = false, length = 150)
    private String password;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RoleID", nullable = false)
    private Role roleID;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
    private Profile profile;

    @OneToMany(mappedBy = "sellerID")
    private Set<Product> products = new LinkedHashSet<>();

    @OneToMany(mappedBy = "buyerID")
    private Set<Transaction> transactions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "buyerID")
    private Set<Cart> carts = new LinkedHashSet<>();

}