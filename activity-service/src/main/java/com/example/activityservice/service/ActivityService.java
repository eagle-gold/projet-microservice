package com.example.activityservice.service;

import com.example.activityservice.model.Activity;
import com.example.activityservice.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public List<Activity> getAllActivities() {
        return activityRepository.findAll();
    }

    public List<Activity> getActivitiesByPoiNameAndDateRange(String poiName, LocalDate start, LocalDate end) {
        return activityRepository.findAll().stream()
                .filter(a -> a.getPoiName().equalsIgnoreCase(poiName)
                        && (a.getStartDate().isBefore(end) || a.getStartDate().isEqual(end))
                        && (a.getEndDate().isAfter(start) || a.getEndDate().isEqual(start)))
                .collect(Collectors.toList());
    }

    public Activity createActivity(Activity activity) {
        return activityRepository.save(activity);
    }

    public void deleteActivity(String id) {
        activityRepository.deleteById(id);
    }
    public List<Activity> getActivitiesByPoiName(String poiName) {
        return activityRepository.findByPoiName(poiName);
    }
}
