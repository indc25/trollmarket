package com.exercise.trollmarket.repositories;

import com.exercise.trollmarket.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}