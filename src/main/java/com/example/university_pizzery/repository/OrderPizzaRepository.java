package com.example.university_pizzery.repository;

import com.example.university_pizzery.entity.OrderPizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderPizzaRepository extends JpaRepository<OrderPizza,Integer> {}
