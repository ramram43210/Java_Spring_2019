package com.ram.core;

import java.util.ArrayList;

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

		Employee employee1 = new Employee(1, "Peter", 28, 80000);
		Employee employee2 = new Employee(2, "Dave", 38, 90000);
		Employee employee3 = new Employee(3, "John", 48, 10000);
	
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);

		EmployeeDAO employeeDAO = (EmployeeDAO) context
				.getBean("employeeDAO");
		
		employeeDAO.batchInsert(employeeList);
		System.out.println(
				"Employee records are inserted successfully.");
	}
}
