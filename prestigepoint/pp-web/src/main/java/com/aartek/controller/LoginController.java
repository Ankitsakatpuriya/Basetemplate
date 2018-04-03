 package com.aartek.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.User;
import com.aartek.service.LoginService;


@Controller
public class LoginController 
{

	@Autowired
	private LoginService loginservice;
	
	
	@RequestMapping("/showPage")
	public String showPage(Model model)
	{

		System.out.println("hello");
		loginservice.showPage();
		
		User user = new User();
		model.addAttribute("keyUser",user);
		System.out.println("inside Controller");
		return "login";
	}
		
		@RequestMapping(value = "/checklogin", method = RequestMethod.POST)
		public String signInAction(@ModelAttribute("keyUser")User user)
		{
			System.out.println(user.getEmail());
			System.out.println(user.getPassword());
			
			return "login";
				}
		
	
	}
