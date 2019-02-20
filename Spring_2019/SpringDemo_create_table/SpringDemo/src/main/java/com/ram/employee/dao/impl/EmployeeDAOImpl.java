package com.ram.employee.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ram.employee.dao.EmployeeDAO;

public class EmployeeDAOImpl
		extends JdbcDaoSupport implements EmployeeDAO
{

	public void createTable()
	{
		String sql = "create table Address (id integer, city varchar(100))";
		getJdbcTemplate().execute(sql);
	}

}
