package com.ram.employee.dao;

import com.ram.employee.model.Employee;

public interface EmployeeDAO 
{
	public Employee findByEmployeeId(int employeeId);
}