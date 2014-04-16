package com.iwork.system.service.impl;

import java.util.List;

import com.iwork.system.entity.User;
import com.iwork.system.permission.UserPermission;

public class UserServiceImpl implements UserPermission {

	private UserPermission userPermission;

	public void setUserPermission(UserPermission userPermission) {
		this.userPermission = userPermission;
	}

	public void saveUser(User user) {
		userPermission.saveUser(user);
	}

	public void addUser(User user) {
		userPermission.saveUser(user);
	}

	public List<User> getAllUsers() {
		return userPermission.getAllUsers();
	}

	public User getUser(Integer id) {
		return userPermission.getUser(id);
	}

	public void updateUser(User user) {
		userPermission.updateUser(user);
	}

	public void deleteUser(User user) {
		userPermission.deleteUser(user);
	}

}
