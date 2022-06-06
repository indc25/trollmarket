package com.exercise.trollmarket.repositories;

import com.exercise.trollmarket.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}