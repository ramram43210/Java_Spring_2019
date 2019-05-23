package com.ram.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ram.model.Employee;

@RestController
public class EmployeeController
{
	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
	public Employee getEmployeeInfo(Model model)
	{
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Peter");
		employee.setAge(34);
		employee.setSalary(30000);
		return employee;
	}
}
