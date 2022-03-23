package com.cjc.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.crud.model.Student;
import com.cjc.crud.service.HomeService;

@Controller
public class HomeController 
{
	
	@Autowired
	HomeService hs;

	@RequestMapping("/log")
	public String prelogin()
	{
		System.out.println("This is Pre Login Process");
		return "login";
	}
	
	@RequestMapping("/reg")
	public String preRegister()
	{
		System.out.println("This is pre Register Page");
		return "register";
	}
	
	@RequestMapping("/registration")
	public String registerData(@ModelAttribute Student s)
	{
		System.out.println("This is Register Page");
		
		int i=hs.saveuser(s);
		
		if(i>0)
		{
			return "index";
		}
		else
		{
			return "register";
		}
	}
}
