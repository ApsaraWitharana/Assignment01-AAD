package com.example.test01.dep;

import org.springframework.stereotype.Component;

@Component
public class FishBun implements FoodItems{
    @Override
    public void foodLover() {
        System.out.println("Food is fish bun");
    }
}
