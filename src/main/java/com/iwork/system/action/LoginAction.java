package com.iwork.system.action;

import com.iwork.system.entity.User;
import com.iwork.system.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {

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
	
	public String login() throws Exception {
		User loginUser = userService.getUser(user.getId());
		if(loginUser!=null)
	      return SUCCESS;
		else
		  return ERROR;
	}
	
	public String loginout() throws Exception {
		return SUCCESS;
	}
}
