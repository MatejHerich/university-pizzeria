package com.example.university_pizzery.repository;

import com.example.university_pizzery.entity.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza,Integer> {}
