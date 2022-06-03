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
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RoleID", nullable = false)
    private Integer id;

    @Column(name = "RoleName", nullable = false, length = 20)
    private String roleName;

    @OneToMany(mappedBy = "roleID")
    private Set<User> users = new LinkedHashSet<>();

}