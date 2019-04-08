package com.ram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class AdminserverApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(AdminserverApplication.class, args);
	}

}
