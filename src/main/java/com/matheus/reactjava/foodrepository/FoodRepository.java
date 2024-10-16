package com.matheus.reactjava.foodrepository;

import com.matheus.reactjava.food.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
