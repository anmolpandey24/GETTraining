package com.coforge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@ResponseBody

public class LoginController {
	
	@RequestMapping("/login")
	public ModelAndView dologin() {
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping("/authenticate")
	public ModelAndView doAuthentication(@RequestParam("uname")String uname,@RequestParam("pwd") String pwd) {
		String username=uname;
		String password=pwd;
		ModelAndView mv=null;
		
		if(username.equals("anmol")&& password.equals("anmol@123")) {
//			mv.addObject("username",username);
			
			 mv=new ModelAndView("welcome");
		}
		else
			mv=new ModelAndView("error");
			return mv;
	}
	
	

}
