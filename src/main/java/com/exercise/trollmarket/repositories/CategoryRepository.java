package com.exercise.trollmarket.repositories;

import com.exercise.trollmarket.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}