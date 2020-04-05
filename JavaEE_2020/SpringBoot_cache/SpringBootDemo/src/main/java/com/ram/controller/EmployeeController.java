package com.ram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
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
	@Cacheable(value = "cacheEmployees")
	public ResponseEntity<Object> getEmployees()
	{
		System.out.println("inside  getEmployees() method ....");
		List<Employee> employeeList = employeeRepository.findAll();
		System.out.println("employeeList = "+employeeList);
		return new ResponseEntity<>(employeeList, HttpStatus.OK);
	}

	/**
	 * @CacheEvict will clear the cache when delete any employee info from the database.
	 */
	@RequestMapping(value = "/clearCache", method = RequestMethod.POST)
	@CacheEvict(value = "cacheEmployees", allEntries = true)
	public void clearCacheEmployees()
	{

	}

}
