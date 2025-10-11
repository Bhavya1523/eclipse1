package com.example.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.placement.model.Placement;

public interface PlacementRepository extends JpaRepository<Placement, Long> {
}

