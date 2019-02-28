package com.ram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ram.model.Employee;

/**
 * We have implemented CommandLineRunner interface here. This
 * interface indicates that bean should run if it is contained in
 * spring application.
 */
@SpringBootApplication
public class SpringBootStandAloneApplication implements CommandLineRunner
{
	@Autowired
	Employee employee;

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootStandAloneApplication.class,
				args);
	}

	public void run(String... arg0) throws Exception
	{

		System.out.println(
				"Employee Name = " + employee.getEmployeeName());
	}
}