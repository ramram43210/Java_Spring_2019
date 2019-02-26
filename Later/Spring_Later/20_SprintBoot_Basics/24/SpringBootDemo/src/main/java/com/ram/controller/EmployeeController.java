package com.ram.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
	@RequestMapping(value = "/getName")
	public String hello()
	{
		System.out.println(
				"Inside hello() method of EmployeeController");
		return "Peter ";
	}

}
