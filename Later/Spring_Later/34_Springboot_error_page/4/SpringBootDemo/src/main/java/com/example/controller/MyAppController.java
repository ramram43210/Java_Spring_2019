package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAppController
{
	@RequestMapping("/hello")
	public void handleRequest()
	{
		throw new RuntimeException("RuntimeException from Application");
	}
}
