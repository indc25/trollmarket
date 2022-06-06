package com.exercise.trollmarket.repositories;

import com.exercise.trollmarket.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}