package com.example.demo.rest;


import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.persistence.domain.Users;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("/user")
public class Rest {

	private UserService Service;

	@Autowired
	public Rest(UserService service) {
		super();
		this.Service = service;

	}

	@GetMapping("/usersDetails/getAll")
	public List<Users> getAlluserDetails() {
		return this.Service.getAllUsers();
	}

	@PutMapping("/updateuserDetails")
	public Users updateuserDetails(@PathParam("id") Long id, @RequestBody Users userDetails) {
		return this.Service.updateUser(userDetails, id);

	}
	
	@PostMapping("/createUser")
	public Users createUser(@RequestBody Users userDetails) {
		return this.Service.createUser(userDetails);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable Long id) {
		this.Service.deleteUser(id);
	}
}