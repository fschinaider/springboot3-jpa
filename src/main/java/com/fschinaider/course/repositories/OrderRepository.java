package com.fschinaider.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fschinaider.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
