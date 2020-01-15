package com.ram.repository;

import java.util.List;

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
	public List<Employee> getEmployees()
	{
		return jdbcTemplate.query("select * from EMPLOYEE", new EmployeeRowMapper());
	}
}
