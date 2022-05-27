package org.spring.service;

import org.spring.dao.UserDao;
import org.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	
	public int createUser(User user) {
		return this.userDao.save(user);
	}
}