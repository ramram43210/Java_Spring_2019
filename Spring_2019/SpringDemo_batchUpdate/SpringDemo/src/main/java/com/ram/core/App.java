package com.ram.core;

import java.util.ArrayList;
import java.util.List;

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

		Employee employee1 = new Employee(1, "Peter", 28, 70000);
		Employee employee2 = new Employee(2, "Dave", 30, 20000);
		Employee employee3 = new Employee(3, "Ram", 45, 50000);

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);

		employeeDAO.insertEmployeeRecords(employeeList);
		System.out.println(
				"Employee records are inserted successfully.");
	}
}
