package com.samueldev.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.samueldev.course.entities.User;
import com.samueldev.course.repositories.UserRepository;

// Configuration class
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	// Sets an dependency injection via framework
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", 	"999999999", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "998888888", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
}
