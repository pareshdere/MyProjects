package com.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserRepository;
import com.app.pojos.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserRepository repo;
	
	@Override
	public Optional<User> getAuthenticatedUser(String email, String password) {
		
		return repo.findByEmailAndPassword(email, password);
	}

}
