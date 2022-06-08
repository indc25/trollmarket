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
public class Balance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BalanceID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UserID", nullable = false)
    private User userID;

    @Column(name = "Saldo", precision = 19, scale = 4)
    private BigDecimal saldo;

    @OneToMany(mappedBy = "balanceID")
    private Set<Profile> profiles = new LinkedHashSet<>();

}