package com.ram.employee.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ram.employee.dao.EmployeeDAO;

public class EmployeeDAOImpl
		extends JdbcDaoSupport implements EmployeeDAO
{

	public void deleteByEmployeeId(int employeeId)
	{
		String sql = "DELETE FROM EMPLOYEE WHERE EMPLOYEE_ID=?";
		getJdbcTemplate().update(sql, employeeId);
	}

}
