package com.iwork.system.permission;

import java.util.List;

import com.iwork.system.entity.User;

public interface UserPermission {
	
	public void saveUser(User user);

	public void updateUser(User user);

	public void deleteUser(User user);

	public List<User> getAllUsers();

	public User getUser(Integer id);
}
