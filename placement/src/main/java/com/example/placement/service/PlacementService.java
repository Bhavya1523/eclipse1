package com.example.placement.service;

import com.example.placement.model.Placement;
import java.util.List;

public interface PlacementService {

    Placement savePlacement(Placement placement);
    List<Placement> getAllPlacements();
    Placement getPlacementById(Long id);
    Placement updatePlacement(Long id, Placement placement);
    void deletePlacement(Long id);
}
