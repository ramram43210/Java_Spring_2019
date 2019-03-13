package com.ram.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ram.mapper.EmployeeRowMapper;
import com.ram.model.Employee;

@Repository
public class EmployeeRepository
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional(readOnly = true)
	public Employee findById(int id)
	{
		String sql = "SELECT * FROM EMPLOYEE WHERE ID = ?";

		Employee employee = jdbcTemplate.queryForObject(sql, new Object[] { id },
				new EmployeeRowMapper());

		return employee;
	}

}
