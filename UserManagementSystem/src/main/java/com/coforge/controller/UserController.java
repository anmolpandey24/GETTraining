package com.coforge.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entity.User;
import com.coforge.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	private static final Logger logger=LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public List<User> findAll(){
		logger.info("Fetching All Users Information");
		return userService.findAll();
	}
	@PostMapping("/")
	public User save(@RequestBody User user) {
		logger.info("Saving User Info {}",user);
		return userService.save(user);
		
	}
	@GetMapping("{uid}")
	public User findById(@PathVariable long uid){
		logger.info("Fetching user by user id {}",uid);
		return userService.findById(uid);
	}


}
