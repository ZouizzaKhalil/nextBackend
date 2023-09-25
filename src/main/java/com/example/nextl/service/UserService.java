package com.example.nextl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nextl.bean.User;
import com.example.nextl.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	public UserDao userDao;

	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	public List<User> findAll() {
		return userDao.findAll();
	}
	
	
	
	
}
