package com.example.activityservice.controller;

import com.example.activityservice.model.Activity;
import com.example.activityservice.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping
    public List<Activity> getAllActivities() {
        return activityService.getAllActivities();
    }

    @GetMapping("/search")
    public List<Activity> getActivitiesByPoiAndDate(
            @RequestParam String poiName,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate start,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate end
    ) {
        System.out.println(">>> poi=" + poiName + ", start=" + start + ", end=" + end);
        return activityService.getActivitiesByPoiNameAndDateRange(poiName, start, end);
    }

    @PostMapping
    public Activity createActivity(@RequestBody Activity activity) {
        return activityService.createActivity(activity);
    }

    @DeleteMapping("/{id}")
    public void deleteActivity(@PathVariable String id) {
        activityService.deleteActivity(id);
    }

    @GetMapping("/poi/{poiName}")
    public List<Activity> getActivitiesByPoiName(@PathVariable String poiName) {
        return activityService.getActivitiesByPoiName(poiName);
    }
}
