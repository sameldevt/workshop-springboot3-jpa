package com.samueldev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samueldev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
