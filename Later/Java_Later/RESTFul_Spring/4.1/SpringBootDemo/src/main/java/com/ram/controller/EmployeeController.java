package com.ram.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ram.model.Employee;

@RestController
public class EmployeeController
{
	@RequestMapping(value = "/employee/{employeeId}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable int employeeId)
	{
		Employee employee = new Employee();
		employee.setId(employeeId);
		employee.setName("Peter");
		employee.setAge(34);
		employee.setSalary(30000);
		return employee;
	}
}
