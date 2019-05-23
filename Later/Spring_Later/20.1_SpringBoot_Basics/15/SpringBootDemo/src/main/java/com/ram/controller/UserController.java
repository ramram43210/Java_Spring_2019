package com.ram.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController
{
	@GetMapping("/login")
	public ModelAndView showLoginPage(Model model)
	{
		model.addAttribute("message", "Hi, Welcome to Spring Boot World");

		return new ModelAndView("welcome");
	}
}
