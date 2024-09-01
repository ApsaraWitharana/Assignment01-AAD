package com.example.test01.controller;

import com.example.test01.repo.PreferenceHistory;
import com.example.test01.service.FoodPreferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
@RequestMapping("/api/v1/preferences")

public class ItemController {
    @Autowired
    private FoodPreferenceService foodPreferenceService;

    @PostMapping("/change")
    public ResponseEntity<Void> changePreference(@RequestParam Long foodItemId) {
        foodPreferenceService.changePreference(foodItemId);
        System.out.println("Save Successfully!!");
        return ResponseEntity.ok().build();
    }

    @GetMapping("/history")
    public ResponseEntity<List<PreferenceHistory>> getHistory() {
        return ResponseEntity.ok(foodPreferenceService.getPreferenceHistory());
    }

    }
