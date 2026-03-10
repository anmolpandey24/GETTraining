package com.coforge;

import java.util.HashSet;

public class User {
	private String username;
	private String password;
	private String mobile;
	private String email;
    public static HashSet<User> users = new HashSet<>();
    
    public User(String username,String password,String mobile,String email) {
    	this.username=username;
    	this.password=password;
    	this.mobile=mobile;
    	this.email=email;
    	
    }
    
    public String getUsername() {
    	return username;
    }
    
    public String getPassword() {
    	return password;
    }

    public static void addUser(String username,String password,String mobile,String email) {
    	users.add(new User(username,password,mobile,email));
        
    }
    public static boolean validateuser(String username,String Password) {
    	for(User u:users) {
    		if
    		(u.username.equals(username) &&
    		u.password.equals(Password)) {
    			return true;
    		}
    	}
    	return false;
    }
    
    
}
