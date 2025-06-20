package com.example.activityservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "activities")
public class Activity {

    @Id
    private String id;

    private String poiName;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;

    // Constructeurs
    public Activity() {}

    public Activity(String poiName, String name, LocalDate startDate, LocalDate endDate) {
        this.poiName = poiName;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPoiName() {
        return poiName;
    }

    public void setPoiName(String poiName) {
        this.poiName = poiName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
