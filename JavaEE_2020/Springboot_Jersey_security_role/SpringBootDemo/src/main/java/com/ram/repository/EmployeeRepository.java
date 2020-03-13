package com.ram.repository;

import org.springframework.data.repository.CrudRepository;

import com.ram.model.Employee;  

public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{

}
