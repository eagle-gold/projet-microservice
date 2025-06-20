package com.example.tripservice.controller;

import com.example.tripservice.model.Trip;
import com.example.tripservice.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/trips")
public class TripController {

    @Autowired
    private TripService tripService;

    @GetMapping
    public List<Trip> getAllTrips() {
        return tripService.getAllTrips();
    }

    @GetMapping("/{id}")
    public Optional<Trip> getTripById(@PathVariable String id) {
        return tripService.getTripById(id);
    }

    @PostMapping
    public Trip createTrip(@RequestBody Trip trip) {
        return tripService.createTrip(trip);
    }

    @DeleteMapping("/{id}")
    public void deleteTrip(@PathVariable String id) {
        tripService.deleteTrip(id);
    }

    @PutMapping("/{id}")
    public Trip updateTrip(@PathVariable String id, @RequestBody Trip trip) {
        return tripService.updateTrip(id, trip);
    }
}
