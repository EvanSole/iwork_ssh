package com.iwork.system.permission.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.iwork.system.entity.User;
import com.iwork.system.permission.UserPermission;

public class UserPermissionImpl extends HibernateDaoSupport implements UserPermission {
	
	public void saveUser(User user) {
		this.getHibernateTemplate().save(user);
	}

	public User getUser(Integer id) {
		return (User) this.getHibernateTemplate().get(User.class, id);
	}

	public void updateUser(User user) {
		this.getHibernateTemplate().saveOrUpdate(user);
	}

	public void deleteUser(User user) {
		this.getHibernateTemplate().delete(user);
	}

	public List<User> getAllUsers() {
		return null;
	}

}
