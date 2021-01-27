package com.ram.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ram.model.Employee;

@RestController
public class EmployeeController
{
	@RequestMapping(value = "/employee/{employeeId}",
			method = RequestMethod.GET,
			produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Employee> getEmployee(@PathVariable int employeeId)
	{
		if (employeeId < 10)
		{
			Employee employee = new Employee();
			employee.setId(employeeId);
			employee.setName("Peter");
			employee.setAge(34);
			employee.setSalary(30000);
			return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST);
		}
	}
}
