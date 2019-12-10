package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistence.domain.Users;
import com.example.demo.persistence.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo repo;
	
	

	public UserService(UserRepo repo) {
		super();
		this.repo = repo;
	}

	public UserRepo getRepo() {
		return repo;
	}

	public void setRepo(UserRepo repo) {
		this.repo = repo;
	}

	public List<Users> getAllUsers() {
		return this.repo.findAll();
	}

	public Users createUser(Users user) {
		return this.repo.save(user);
	}

	public void deleteUser(Long id) {
		this.repo.deleteById(id);
		
	}
	

}
