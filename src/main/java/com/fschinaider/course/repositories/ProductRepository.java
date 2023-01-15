package com.fschinaider.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fschinaider.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
