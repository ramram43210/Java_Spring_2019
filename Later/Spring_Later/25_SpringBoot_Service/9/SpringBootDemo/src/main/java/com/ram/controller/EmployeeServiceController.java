package com.ram.controller;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ram.model.Employee;

@RestController
public class EmployeeServiceController
{
	private static final Logger LOG = Logger.getLogger(EmployeeServiceController.class.getName());
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ResponseEntity<Object> getEmployees()
	{
		
		LOG.log(Level.INFO, "Inside getEmployees method of SpringBootDemo Application");
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Peter");
		employee.setAge(30);
		employee.setSalary(50000);
		
		employeeList.add(employee);
		
		return new ResponseEntity<>(employeeList, HttpStatus.OK);
	}

}
