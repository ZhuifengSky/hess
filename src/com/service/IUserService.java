package com.service;

import java.util.List;

import com.model.User;

public interface IUserService {

	public List<User> searchUsers(User queryBean);
}
