package com.example.nextl.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.nextl.bean.User;

public interface UserDao extends JpaRepository<User, Long>{

	
	User findByEmail(String email);
	
    List<User> findAll();

}
