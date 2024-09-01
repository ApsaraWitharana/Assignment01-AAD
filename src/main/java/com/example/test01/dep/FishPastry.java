package com.example.test01.dep;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishPastry implements FoodItems{
    @Override
    public void foodLover() {
        System.out.println("Food is fish pastry");
        System.out.println("Food is fish pastry");

    }
}
