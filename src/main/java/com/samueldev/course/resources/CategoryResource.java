package com.samueldev.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samueldev.course.entities.Category;
import com.samueldev.course.services.CategoryService;

// tells the program that this is an web resource using rest controllers
@RestController 
// sets the resource name
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	/*
	 *  end point to access the users
	 * 	ResponseEntity is a spring type that returns responses from web requests
	 *  @GetMapping indicates that this method will answer to GET requests from http
	 */
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		/*
		 * .ok() is used to send an success responses to http
		 * .body() is the body of the response
		 */
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
