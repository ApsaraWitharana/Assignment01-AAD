package com.example.test01.repo;

import com.example.test01.entitiy.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface FoodItemRepository extends JpaRepository<FoodItem,Long> {
   @Override
     Optional<FoodItem> findById(Long aLong);
}
