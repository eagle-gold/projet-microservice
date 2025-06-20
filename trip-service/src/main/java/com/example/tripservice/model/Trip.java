package com.example.tripservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "trips")
public class Trip {

    @Id
    private String id;

    private String name;
    private List<Step> steps;


    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> cityNames;

    public Trip() {}

    public Trip(String name, List<Step> steps, LocalDate startDate, LocalDate endDate, List<String> cityNames) {
        this.name = name;
        this.steps = steps;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cityNames = cityNames;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
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

    public List<String> getCityNames() {
        return cityNames;
    }

    public void setCityNames(List<String> cityNames) {
        this.cityNames = cityNames;
    }
}
