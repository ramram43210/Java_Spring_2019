package com.example.Helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldApplication
{
	public static void main(String[] args)
	{
		System.setProperty("server.servlet.context-path", "/myContext");
		System.setProperty("server.port", "9090");
		SpringApplication.run(HelloworldApplication.class, args);
	}
	
	@RequestMapping(value = "/hello")
	public String hello()
	{
		return "Hello World";
	}
}
