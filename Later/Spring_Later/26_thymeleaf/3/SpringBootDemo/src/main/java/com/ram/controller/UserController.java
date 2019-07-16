package com.ram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ram.model.User;

@Controller
public class UserController
{
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute User user)
	{
		System.out.println("User from UI = " + user);
		/*
		 * Here you can write the code to save the user information in database
		 */
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user_information");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
}
