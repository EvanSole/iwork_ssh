package com.iwork.system.action;

import com.iwork.system.entity.User;
import com.iwork.system.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport {

	private User user;
	private UserService userService;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		userService.addUser(user);
		return SUCCESS;
	}
}
