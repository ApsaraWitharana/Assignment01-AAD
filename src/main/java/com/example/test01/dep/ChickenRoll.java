package com.example.test01.dep;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Extra Chicken Food!!")
@Wow
public class ChickenRoll implements FoodItems{
    @Override
    public void foodLover() {
        System.out.println("Food is Chicken Roll");
    }
}
