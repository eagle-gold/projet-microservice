package com.example.accommodationservice.service;

import com.example.accommodationservice.model.Accommodation;
import com.example.accommodationservice.repository.AccommodationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccommodationService {

    @Autowired
    private AccommodationRepository accommodationRepository;

    public List<Accommodation> getAllAccommodations() {
        return accommodationRepository.findAll();
    }

    public Optional<Accommodation> getAccommodationById(Long id) {
        return accommodationRepository.findById(id);
    }

    public List<Accommodation> getAccommodationsByCityId(Long cityId) {
        return accommodationRepository.findByCityId(cityId);
    }

    public Accommodation createAccommodation(Accommodation accommodation) {
        return accommodationRepository.save(accommodation);
    }

    public void deleteAccommodation(Long id) {
        accommodationRepository.deleteById(id);
    }

    public Accommodation updateAccommodation(Long id, Accommodation updated) {
        return accommodationRepository.findById(id).map(accommodation -> {
            accommodation.setName(updated.getName());
            accommodation.setCapacity(updated.getCapacity());
            accommodation.setCityId(updated.getCityId());
            return accommodationRepository.save(accommodation);
        }).orElseGet(() -> {
            updated.setId(id);
            return accommodationRepository.save(updated);
        });
    }
}
