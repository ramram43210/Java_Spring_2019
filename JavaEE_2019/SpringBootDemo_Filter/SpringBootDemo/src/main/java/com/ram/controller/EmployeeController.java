package com.ram.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
	@RequestMapping(value = "/welcome")
	public String welcomePage()
	{
		System.out.println("Inside welcomePage() method of EmployeeController");
		return "Welcome, Peter ";
	}

}
