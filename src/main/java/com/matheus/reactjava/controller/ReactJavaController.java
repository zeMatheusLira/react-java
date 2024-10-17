package com.matheus.reactjava.controller;

import com.matheus.reactjava.food.Food;
import com.matheus.reactjava.food.FoodRequestDTO;
import com.matheus.reactjava.food.FoodResponseDTO;
import com.matheus.reactjava.foodrepository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class ReactJavaController {

    @Autowired
    private FoodRepository foodRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO food) {
        Food foodRequest = new Food(food);
        foodRepository.save(foodRequest);
        return;

    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll(){

        List<FoodResponseDTO> foodList = foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;

    }
}
