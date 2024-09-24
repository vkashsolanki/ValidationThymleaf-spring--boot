package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.services.UserService;

@RestController
@RequestMapping(value = "/api")
public class UserController {
	@Autowired
	private UserService service;
	
	
	@PostMapping(value = "/register")
	public User registerUser(@RequestBody User user) {
		
		return service.createUser(user);
		
		
	}
	
	

}
