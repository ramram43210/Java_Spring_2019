package com.ram;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ram.config.UserProperties;

@SpringBootApplication
public class Application
{
	@Autowired
    private UserProperties userProperties;
	
	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	public void init()
	{
		System.out.println(userProperties.toString());
	}
}
