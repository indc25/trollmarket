package com.exercise.trollmarket.models;

import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Profile {
    @Id
    @Column(name = "UserID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BalanceID", nullable = false)
    private Balance balanceID;

    @Column(name = "FirstName", nullable = false, length = 50)
    private String firstName;

    @Column(name = "LastName", length = 50)
    private String lastName;

    @Lob
    @Column(name = "Address", nullable = false)
    private String address;

}