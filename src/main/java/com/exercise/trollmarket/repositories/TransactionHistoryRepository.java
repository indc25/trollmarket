package com.exercise.trollmarket.repositories;

import com.exercise.trollmarket.models.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionHistoryRepository extends JpaRepository<TransactionHistory, Integer> {
}