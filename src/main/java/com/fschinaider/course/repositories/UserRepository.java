package com.fschinaider.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fschinaider.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
