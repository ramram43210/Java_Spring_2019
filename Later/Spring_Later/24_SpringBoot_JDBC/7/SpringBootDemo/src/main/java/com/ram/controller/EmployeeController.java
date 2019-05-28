package com.ram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ram.model.Employee;
import com.ram.repository.EmployeeRepository;

@RestController
public class EmployeeController
{

	@Autowired
	private EmployeeRepository employeeRepository;

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ResponseEntity<Object> getEmployees()
	{
		System.out.println("inside  getEmployees() method ....");
		List<Employee> employeeList = employeeRepository.findAll();
		return new ResponseEntity<>(employeeList, HttpStatus.OK);
	}

}
