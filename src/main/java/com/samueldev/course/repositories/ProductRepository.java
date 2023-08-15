package com.samueldev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samueldev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
