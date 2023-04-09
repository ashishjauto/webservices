package com.aj.webservices.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.aj.webservices.users.User;
import com.aj.webservices.users.UserDaoService;

@RestController
public class UserResource {
	
	private UserDaoService service;
	
	public UserResource(UserDaoService service) {
		this.service =service;
	}
	
	@GetMapping(path="/users")
	public List<User> retriveAllUsers(){
		return service.findAll();
	}
	
	
	@GetMapping("/users/{id}")
	public User retriveUserById(@PathVariable int id){
		return service.findOne(id);
	}
	
	//POST /users
		@PostMapping(path="/users")
		public ResponseEntity<User> createUser(@RequestBody User user) {
		 User savedUser=	service.save(user);
			
		 URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
			return ResponseEntity.created(location).build();
		}
}
