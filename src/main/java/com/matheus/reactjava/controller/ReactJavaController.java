package com.matheus.reactjava.controller;

import com.matheus.reactjava.food.Food;
import com.matheus.reactjava.foodrepository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("food")
public class ReactJavaController {

    @Autowired
    private FoodRepository foodRepository;

    @GetMapping
    public List<Food> getAll(){

        List<Food> foodList = foodRepository.findAll();
        return foodList;

    }
}
 