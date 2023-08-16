package com.samueldev.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samueldev.course.entities.User;
import com.samueldev.course.repositories.UserRepository;

// Register this class as an spring component so it can be automatically injected with @Autowired
// @Component

// @Service does the same as @Component but its more specific
@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
}
