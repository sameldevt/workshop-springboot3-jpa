package com.samueldev.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samueldev.course.entities.User;

// tells the program that this is an web resource using rest controllers
@RestController 
// sets the resource name
@RequestMapping(value = "/users")
public class UserResource {
	
	/*
	 *  end point to access the users
	 * 	ResponseEntity is a spring type that returns responses from web requests
	 *  @GetMapping indicates that this method will answer to GET requests from http
	 */
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		/*
		 * .ok() is used to send an success responses to http
		 * .body() is the body of the response
		 */
		return ResponseEntity.ok().body(u);
	}
}
