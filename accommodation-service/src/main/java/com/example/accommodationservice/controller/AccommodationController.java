package com.example.accommodationservice.controller;

import com.example.accommodationservice.model.Accommodation;
import com.example.accommodationservice.service.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/accommodations")
public class AccommodationController {

    @Autowired
    private AccommodationService accommodationService;

    @GetMapping
    public List<Accommodation> getAllAccommodations() {
        return accommodationService.getAllAccommodations();
    }

    @GetMapping("/{id}")
    public Optional<Accommodation> getAccommodationById(@PathVariable Long id) {
        return accommodationService.getAccommodationById(id);
    }

    @GetMapping("/city/{cityId}")
    public List<Accommodation> getAccommodationsByCity(@PathVariable Long cityId) {
        return accommodationService.getAccommodationsByCityId(cityId);
    }

    @PostMapping
    public Accommodation createAccommodation(@RequestBody Accommodation accommodation) {
        return accommodationService.createAccommodation(accommodation);
    }

    @PutMapping("/{id}")
    public Accommodation updateAccommodation(@PathVariable Long id, @RequestBody Accommodation accommodation) {
        return accommodationService.updateAccommodation(id, accommodation);
    }

    @DeleteMapping("/{id}")
    public void deleteAccommodation(@PathVariable Long id) {
        accommodationService.deleteAccommodation(id);
    }
}
