package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.model.User;
import com.service.IUserService;

public class UserServiceImpl implements IUserService {

	@Override
	public List<User> searchUsers() {
		List<User> users = new ArrayList<User>();
		for (int i = 0; i < 5; i++) {
			User user = new User();
			user.setUserName("ÓÃ»§"+i);
			user.setAge(i);
			users.add(user);
		}
		return users;
	}

}
