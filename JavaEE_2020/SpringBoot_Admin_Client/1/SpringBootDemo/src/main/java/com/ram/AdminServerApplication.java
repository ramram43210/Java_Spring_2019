package com.ram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class AdminServerApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(AdminServerApplication.class, args);
	}

}
