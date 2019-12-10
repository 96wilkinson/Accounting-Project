package com.example.demo.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.persistence.domain.Users;
import com.example.demo.services.UserService;

@RestController
public class UserController {
	
	private UserService service;

	public UserController(UserService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/getAll")
	public List<Users>getAll(){
		return this.service.getAllUsers();
	}
	
	@PostMapping("/createUser")
	public Users createUser(@RequestBody Users user) {
		return this.service.createUser(user);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser(@PathParam("id") Long id, Users user) {
		this.service.deleteUser(id);
	}
	
	}


