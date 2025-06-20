package com.example.cityservice.service;

import com.example.cityservice.model.City;
import com.example.cityservice.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    public Optional<City> getCityById(Long id) {
        return cityRepository.findById(id);
    }

    public City createCity(City city) {
        return cityRepository.save(city);
    }

    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }

    public City updateCity(Long id, City newCity) {
        return cityRepository.findById(id)
                .map(city -> {
                    city.setName(newCity.getName());
                    city.setLatitude(newCity.getLatitude());
                    city.setLongitude(newCity.getLongitude());
                    return cityRepository.save(city);
                })
                .orElseGet(() -> {
                    newCity.setId(id);
                    return cityRepository.save(newCity);
                });
    }
}
