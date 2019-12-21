package com.ram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ram.model.Employee;
import com.ram.model.User;
import com.ram.repository.EmployeeRepository;
import com.ram.repository.UserRepository;

@SpringBootApplication
public class Application implements CommandLineRunner
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}
	
	public void run(String... arg0) throws Exception
	{
		System.out.println("inside run ....");
		Employee employee = new Employee("Peter", 28, 80000);
		employeeRepository.insert(employee);
		System.out.println("Employee record inserted successfully in first database");
		
		User user = new User("Marco","marco@yahoo.com","male");
		userRepository.insert(user);
		System.out.println("User record inserted successfully in second database");
	}
	
}
