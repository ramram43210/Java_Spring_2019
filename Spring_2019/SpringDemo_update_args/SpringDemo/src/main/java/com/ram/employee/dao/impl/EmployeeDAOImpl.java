package com.ram.employee.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ram.employee.dao.EmployeeDAO;

public class EmployeeDAOImpl
		extends JdbcDaoSupport implements EmployeeDAO
{

	public int updateEmployeeNameBasedOnAge(String name, int age)
	{
		String sql = "update Employee set Name=? where AGE=?";
		int numberOfRowsAffected = getJdbcTemplate().update(sql, name, age);
		return numberOfRowsAffected;
	}

}
