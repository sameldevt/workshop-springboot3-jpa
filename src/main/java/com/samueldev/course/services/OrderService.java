package com.samueldev.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samueldev.course.entities.Order;
import com.samueldev.course.entities.User;
import com.samueldev.course.repositories.OrderRepository;

// Register this class as an spring component so it can be automatically injected with @Autowired
// @Component

// @Service does the same as @Component but its more specific
@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
