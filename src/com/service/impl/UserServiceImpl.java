package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.model.User;
import com.service.IUserService;

public class UserServiceImpl implements IUserService {

	@Override
	public List<User> searchUsers(User queryBean) {
		List<User> users = new ArrayList<User>();
		if (queryBean.getUserName().equals("admin")) {
			for (int i = 0; i < 5; i++) {
				User user = new User();
				user.setUserName("�û�"+i);
				user.setAge(i);
				users.add(user);
			}
		}else{
			User user = new User();
			user.setAge(999);
			user.setUserName("�Ƿ��û�");
			users.add(user);
		}
		return users;
	}

}
