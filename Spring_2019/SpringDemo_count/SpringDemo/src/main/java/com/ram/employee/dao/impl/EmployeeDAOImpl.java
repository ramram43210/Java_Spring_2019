package com.ram.employee.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ram.employee.dao.EmployeeDAO;

public class EmployeeDAOImpl
		extends JdbcDaoSupport implements EmployeeDAO
{

	public int findTotalEmployee()
	{
		String sql = "SELECT COUNT(*) FROM EMPLOYEE";

		int count = getJdbcTemplate().queryForObject(
                sql, Integer.class);

		return count;
	}

}
