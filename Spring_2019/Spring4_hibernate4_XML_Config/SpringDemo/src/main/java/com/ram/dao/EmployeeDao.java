package com.ram.dao;

import java.util.List;

import com.ram.model.Employee;

public interface EmployeeDao
{
	public void saveEmployee(Employee employee);

	public List<Employee> findAllEmployees();

	public void deleteEmployeeBySsn(String ssn);

	public Employee findBySsn(String ssn);

	public void updateEmployee(Employee employee);
}
