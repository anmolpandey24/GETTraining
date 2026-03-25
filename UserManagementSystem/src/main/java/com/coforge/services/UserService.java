package com.coforge.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.entity.User;
import com.coforge.repository.UserRepository;

@Service
public class UserService {
	
	private static final Logger logger=LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		
		logger.info("FindAll Method invoked in service layer");
		return userRepository.findAll();
	}
	
	public User save(User user) {
		
		User user1=userRepository.save(user);
		logger.info("save method of service layer invoked ");
		return user1;
		
	}
	
	public User findById(long uid){
		
		logger.info("fetching user information of id {},find by id of service layer invoked",uid);
		return userRepository.findById(uid).get();
	}

}
