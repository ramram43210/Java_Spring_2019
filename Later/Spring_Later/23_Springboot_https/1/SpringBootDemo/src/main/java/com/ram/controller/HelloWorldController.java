package com.ram.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{

	@RequestMapping(value = "/hello")
	public String sendEmail()
	{
		return "Hello World, Peter";
	}

}
