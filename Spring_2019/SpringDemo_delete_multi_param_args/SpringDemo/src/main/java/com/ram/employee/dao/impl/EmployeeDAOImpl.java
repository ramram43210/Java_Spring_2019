package com.ram.employee.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ram.employee.dao.EmployeeDAO;

public class EmployeeDAOImpl
		extends JdbcDaoSupport implements EmployeeDAO
{

	public int deleteByEmployeeNameAndAge(String name,int age)
	{
		String sql = "DELETE FROM EMPLOYEE WHERE Name=? and AGE=?";
		int numberOfRowsAffected = getJdbcTemplate().update(sql, name,age);
		return numberOfRowsAffected;
	}

}
