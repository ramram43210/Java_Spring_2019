package com.ram.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartupRunner implements CommandLineRunner
{

	@Override
	public void run(String... args) throws Exception
	{
		System.out.println("ApplicationStartupRunner, run method Started !!");
	}

}
