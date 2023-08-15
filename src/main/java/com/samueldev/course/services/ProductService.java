package com.samueldev.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samueldev.course.entities.Product;
import com.samueldev.course.repositories.ProductRepository;

// Register this class as an spring component so it can be automatically injected with @Autowired
// @Component

// @Service does the same as @Component but its more specific
@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
