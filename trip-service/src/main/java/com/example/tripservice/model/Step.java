package com.example.tripservice.model;

import java.time.LocalDate;

public class Step {

    private String cityName;
    private String accommodationName;
    private String activityName;
    private LocalDate date;

    public Step() {}

    public Step(String cityName, String accommodationName, String activityName, LocalDate date) {
        this.cityName = cityName;
        this.accommodationName = accommodationName;
        this.activityName = activityName;
        this.date = date;
    }

    public String getCityName() {
        return cityName;
    }

    public String getAccommodationName() {
        return accommodationName;
    }

    public String getActivityName() {
        return activityName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setAccommodationName(String accommodationName) {
        this.accommodationName = accommodationName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
