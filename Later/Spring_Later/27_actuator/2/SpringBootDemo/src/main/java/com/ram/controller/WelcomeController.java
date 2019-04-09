package com.ram.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController
{
	@RequestMapping("/welcome")
	public String locale()
	{
		return "welcome";
	}

}
