package com.example.test01.dep;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Extra Chicken Food!!")
public class ChickenBun implements FoodItems{
    @Override
    public void foodLover() {
        System.out.println("Food is Chicken Bun ");
    }
}
