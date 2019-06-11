package com.ram.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value = 1)
@Component
public class ApplicationStartupRunnerOne implements CommandLineRunner
{

	@Override
	public void run(String... args) throws Exception
	{
		System.out.println("ApplicationStartupRunnerOne, run method Started !!");
	}

}
