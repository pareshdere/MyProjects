package com.app.service;

import java.util.Optional;

import com.app.pojos.User;

public interface IUserService {
	Optional<User> getAuthenticatedUser(String email,String password);
}
