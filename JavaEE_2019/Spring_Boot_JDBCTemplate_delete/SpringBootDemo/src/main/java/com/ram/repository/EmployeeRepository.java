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
	public int deleteByEmployeeNameAndAge(String name, int age)
	{
		String sql = "DELETE FROM EMPLOYEE WHERE Name=? and AGE=?";
		int numberOfRowsAffected = jdbcTemplate.update(sql, name,age);
		return numberOfRowsAffected;
	}

}
