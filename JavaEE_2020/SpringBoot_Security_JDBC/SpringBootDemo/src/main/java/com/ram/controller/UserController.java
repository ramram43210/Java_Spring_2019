package com.ram.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
	@RequestMapping("/userlogin")
	public String userValidation()
	{
		return "User, Successfully logged in!";
	}

	@RequestMapping("/adminlogin")
	public String adminValidation()
	{
		return "Admin user, Successfully logged in!";
	}
}
