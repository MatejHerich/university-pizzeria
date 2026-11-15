package com.example.university_pizzery.repository;

import com.example.university_pizzery.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer>{}
