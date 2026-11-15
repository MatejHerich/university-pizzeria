package com.example.university_pizzery.repository;

import com.example.university_pizzery.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem,Integer>{}
