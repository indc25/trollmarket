package com.exercise.trollmarket.repositories;

import com.exercise.trollmarket.models.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {
}