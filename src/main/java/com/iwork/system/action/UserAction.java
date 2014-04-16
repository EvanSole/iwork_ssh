package com.iwork.system.action;

import java.util.List;
import java.util.Map;

import com.iwork.system.entity.User;
import com.iwork.system.service.UserService;
import com.opensymphony.xwork2.ActionContext;
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

	public String addUserHtml() throws Exception {
		return "addUser";
	}

	public String addUser() throws Exception {
		userService.addUser(user);
		return SUCCESS;
	}

	public String updateUserHtml() throws Exception {
		return "updateUser";
	}

	public String updateUser() throws Exception {
		userService.updateUser(user);
		return SUCCESS;
	}

	public String deleteUser() throws Exception {
		userService.deleteUser(user);
		return SUCCESS;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String listUser() throws Exception {
		List<User> users = userService.getAllUsers();
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("users", users);
		return SUCCESS;
	}

}
