package com.exercise.trollmarket.repositories;

import com.exercise.trollmarket.models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {
}