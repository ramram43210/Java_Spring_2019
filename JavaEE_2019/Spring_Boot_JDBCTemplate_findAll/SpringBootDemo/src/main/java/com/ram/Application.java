package com.ram;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ram.model.Employee;
import com.ram.repository.EmployeeRepository;

@SpringBootApplication
public class Application implements CommandLineRunner
{
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}

	public void run(String... arg0) throws Exception
	{
		System.out.println("inside run ....");
		List<Employee> employeeList = employeeRepository.findAll();
		System.out.println(employeeList);
	}
}
