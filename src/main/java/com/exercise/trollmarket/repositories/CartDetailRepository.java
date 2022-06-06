package com.exercise.trollmarket.repositories;

import com.exercise.trollmarket.models.CartDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartDetailRepository extends JpaRepository<CartDetail, Integer> {
}