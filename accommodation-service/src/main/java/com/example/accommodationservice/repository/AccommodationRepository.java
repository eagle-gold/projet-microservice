package com.example.accommodationservice.repository;

import com.example.accommodationservice.model.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {
    List<Accommodation> findByCityId(Long cityId);
}