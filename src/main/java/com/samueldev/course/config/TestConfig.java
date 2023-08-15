package com.samueldev.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.samueldev.course.entities.Category;
import com.samueldev.course.entities.Order;
import com.samueldev.course.entities.User;
import com.samueldev.course.entities.enums.OrderStatus;
import com.samueldev.course.repositories.CategoryRepository;
import com.samueldev.course.repositories.OrderRepository;
import com.samueldev.course.repositories.UserRepository;

// Configuration class
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	// Sets an dependency injection via framework
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", 	"999999999", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "998888888", "123456");
		
		// Instant using ISO 8601 pattern
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}
}
