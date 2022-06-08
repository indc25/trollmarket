package com.exercise.trollmarket.repositories;

import com.exercise.trollmarket.models.Balance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BalanceRepository extends JpaRepository<Balance, Integer> {
}