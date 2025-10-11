package com.example.placement.service;

import com.example.placement.model.Placement;
import com.example.placement.repository.PlacementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacementServiceImpl implements PlacementService {

    @Autowired
    private PlacementRepository placementRepository;

    @Override
    public Placement savePlacement(Placement placement) {
        return placementRepository.save(placement);
    }

    @Override
    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }

    @Override
    public Placement getPlacementById(Long id) {
        return placementRepository.findById(id).orElse(null);
    }

    @Override
    public Placement updatePlacement(Long id, Placement placement) {
        Placement existing = placementRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(placement.getName());
            existing.setCollege(placement.getCollege());
            existing.setDate(placement.getDate());
            existing.setQualification(placement.getQualification());
            existing.setYear(placement.getYear());
            return placementRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deletePlacement(Long id) {
        placementRepository.deleteById(id);
    }
}
