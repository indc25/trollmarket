package com.exercise.trollmarket.repositories;

import com.exercise.trollmarket.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}