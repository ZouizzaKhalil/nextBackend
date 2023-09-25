package com.example.nextl.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nextl.bean.User;
import com.example.nextl.service.UserService;

@RestController
@RequestMapping("/api/admin/user")
public class UserWs {
	
	@Autowired
	public UserService userService;

	@GetMapping("/email/{email}")
	public User findByEmail(@PathVariable String email) {
		return userService.findByEmail(email);
	}

	@GetMapping("/")
	public List<User> findAll() {
		return userService.findAll();
	}
	
	

}
