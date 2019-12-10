package com.ram.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeRepository
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public int updateEmployeeNameBasedOnAge(String name, int age)
	{
		String sql = "update Employee set Name=? where AGE=?";
		int numberOfRowsAffected = jdbcTemplate.update(sql, name, age);
		return numberOfRowsAffected;
	}

}
