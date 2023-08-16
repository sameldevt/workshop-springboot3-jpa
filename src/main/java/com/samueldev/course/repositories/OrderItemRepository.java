package com.samueldev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samueldev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}
