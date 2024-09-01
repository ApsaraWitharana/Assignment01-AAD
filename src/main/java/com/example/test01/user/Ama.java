package com.example.test01.user;

import com.example.test01.dep.FoodItems;
import com.example.test01.dep.Wow;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ama {
    @Qualifier("Extra Chicken Food!!")
    private final FoodItems foodItems;

    @Autowired
    @Wow
    public Ama(FoodItems foodItems) {
        this.foodItems = foodItems;
    }


    @PostConstruct
    public void init(){
        foodItems.foodLover();
    }
}
