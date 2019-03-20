package com.ram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ram.model.Employee;
import com.ram.service.EmployeeService;

@RestController
public class EmployeeServiceController
{
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/employees", method = RequestMethod.POST)
	public ResponseEntity<Object> createEmployee(@RequestBody Employee employee)
	{
		employee = employeeService.createEmployee(employee);
		return new ResponseEntity<>(
				"Employee is created successfully with Id = " + employee.getId(),
				HttpStatus.CREATED);
	}

}
