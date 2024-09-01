package com.example.test01.service;

import com.example.test01.entitiy.FoodItem;
import com.example.test01.repo.FoodItemRepository;
import com.example.test01.repo.PreferenceHistory;
import com.example.test01.repo.PreferenceHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FoodPreferenceService {
    @Autowired
    private FoodItemRepository foodItemRepository;

    @Autowired
    private PreferenceHistoryRepository preferenceHistoryRepository;

    public void changePreference(Long foodItemId) {
        FoodItem foodItem = foodItemRepository.findById(foodItemId)
                .orElseThrow(() -> new RuntimeException("Food item not Found !!"));

        PreferenceHistory history = new PreferenceHistory();
        history.setItem(foodItem);
        history.setPreferenceTime(LocalDateTime.now());

        preferenceHistoryRepository.save(history);
    }

    public List<PreferenceHistory> getPreferenceHistory() {
        return preferenceHistoryRepository.findAll();
    }
}
