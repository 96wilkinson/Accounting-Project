package com.example.demo.services;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import com.example.demo.persistence.domain.Users;
import com.example.demo.persistence.repo.UserRepo;

@Service
public class UserService {
	private UserRepo repo;
	public UserService(UserRepo repo) {
		super();
		this.repo = repo;
	}
	public List<Users> getAllUsers() {
		return this.repo.findAll();
	}
	public Users updateUser(Users userDetails, Long id) {
		Users toUpdate = this.repo.getOne(id);
		toUpdate.setFirstName(userDetails.getFirstName());
		toUpdate.setLastName(userDetails.getLastName());
		toUpdate.setAccountNumber(userDetails.getAccountNumber());
		return null;
	}
	public void deleteUser(long id) {
		this.repo.deleteById(id);
	}
	public Users createUser(Users user) {
		return this.repo.save(user);
	}
}
