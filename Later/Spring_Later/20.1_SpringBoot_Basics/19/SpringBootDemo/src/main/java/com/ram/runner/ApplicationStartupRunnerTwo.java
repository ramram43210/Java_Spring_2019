package com.ram.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value=2)
@Component
public class ApplicationStartupRunnerTwo implements CommandLineRunner
{

	@Override
	public void run(String... args) throws Exception
	{
		System.out.println("ApplicationStartupRunnerTwo, run method Started !!");
	}

}
