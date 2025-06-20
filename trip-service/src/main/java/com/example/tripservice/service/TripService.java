package com.example.tripservice.service;

import com.example.tripservice.model.Trip;
import com.example.tripservice.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;

    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

    public Optional<Trip> getTripById(String id) {
        return tripRepository.findById(id);
    }

    public Trip createTrip(Trip trip) {
        return tripRepository.save(trip);
    }

    public void deleteTrip(String id) {
        tripRepository.deleteById(id);
    }

    public Trip updateTrip(String id, Trip updated) {
        return tripRepository.findById(id).map(trip -> {
            trip.setName(updated.getName());
            trip.setSteps(updated.getSteps());
            trip.setStartDate(updated.getStartDate());
            trip.setEndDate(updated.getEndDate());
            trip.setCityNames(updated.getCityNames());
            return tripRepository.save(trip);
        }).orElseGet(() -> {
            updated.setId(id);
            return tripRepository.save(updated);
        });
    }

}
