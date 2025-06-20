package com.example.accommodationservice.model;

import jakarta.persistence.*;

@Entity
public class Accommodation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int capacity;

    @Column(name = "city_id")
    private Long cityId;

    // Constructeurs
    public Accommodation() {}

    public Accommodation(String name, int capacity, Long cityId) {
        this.name = name;
        this.capacity = capacity;
        this.cityId = cityId;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }
}
