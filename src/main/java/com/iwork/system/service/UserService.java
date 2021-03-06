package com.iwork.system.service;

import java.util.List;

import com.iwork.system.entity.User;

public interface UserService {
	
	public void addUser(User user);

	public void updateUser(User user);

	public void deleteUser(User user);

	public List<User> getAllUsers();

	public User getUser(Integer id);
}
