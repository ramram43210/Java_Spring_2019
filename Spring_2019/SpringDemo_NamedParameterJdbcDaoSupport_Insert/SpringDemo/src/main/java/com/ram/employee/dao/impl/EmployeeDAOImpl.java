package com.ram.employee.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import com.ram.employee.dao.EmployeeDAO;
import com.ram.employee.model.Employee;

public class EmployeeDAOImpl
		extends NamedParameterJdbcDaoSupport implements EmployeeDAO
{
	public void insert(Employee employee)
	{

		String sql = "INSERT INTO EMPLOYEE "
				+ "(EMPLOYEE_ID, NAME, AGE,SALARY) VALUES (:employeeId, :name, :age,:salary)";

		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("employeeId", employee.getEmployeeId());
		parameters.put("name", employee.getName());
		parameters.put("age", employee.getAge());
		parameters.put("salary", employee.getSalary());

		getNamedParameterJdbcTemplate().update(sql, parameters);

	}
}
