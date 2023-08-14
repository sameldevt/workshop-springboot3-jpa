package com.samueldev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samueldev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
