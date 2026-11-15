package com.example.university_pizzery.repository;

import com.example.university_pizzery.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient,Integer> {}
