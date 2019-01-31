package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.employee.dao.EmployeeDAO;
import com.ram.employee.model.Employee;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		EmployeeDAO employeeDAO = (EmployeeDAO) context
				.getBean("employeeDAO");
		Employee employee = new Employee(1, "Peter", 28, 80000);
		employeeDAO.insert(employee);
		System.out.println("Employee record inserted successfully.");
	}
}
