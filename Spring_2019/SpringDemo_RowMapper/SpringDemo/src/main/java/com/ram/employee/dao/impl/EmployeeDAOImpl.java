package com.ram.employee.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ram.employee.dao.EmployeeDAO;
import com.ram.employee.dao.mapper.EmployeeRowMapper;
import com.ram.employee.model.Employee;

public class EmployeeDAOImpl
		extends JdbcDaoSupport implements EmployeeDAO
{

	public Employee findByEmployeeId(int employeeId)
	{
		String sql = "SELECT * FROM EMPLOYEE WHERE EMPLOYEE_ID = ?";
		 
		Employee employee = (Employee)getJdbcTemplate().queryForObject(
				sql, new Object[] { employeeId }, new EmployeeRowMapper());
			
		return employee;
		
	}

	
}
