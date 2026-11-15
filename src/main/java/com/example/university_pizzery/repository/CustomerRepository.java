package com.example.university_pizzery.repository;

import com.example.university_pizzery.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {}
