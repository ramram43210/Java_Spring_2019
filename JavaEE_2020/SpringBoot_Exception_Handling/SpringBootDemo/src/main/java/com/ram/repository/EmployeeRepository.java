package com.ram.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ram.mapper.EmployeeRowMapper;
import com.ram.model.Employee;

@Repository
public class EmployeeRepository
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public Employee createEmployee(Employee employee)
	{
		String sql = "INSERT INTO EMPLOYEE " + "(NAME, AGE,SALARY) VALUES (?, ?,?)";
		KeyHolder holder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator()
		{
			@Override
			public PreparedStatement createPreparedStatement(Connection connection)
					throws SQLException
			{
				PreparedStatement ps = connection.prepareStatement(sql,
						Statement.RETURN_GENERATED_KEYS);
				ps.setString(1, employee.getName());
				ps.setInt(2, employee.getAge());
				ps.setInt(3, employee.getSalary());
				return ps;
			}
		}, holder);

		int generatedEmployeeId = holder.getKey().intValue();
		employee.setId(generatedEmployeeId);
		return employee;
	}

	@Transactional
	public void updateEmployee(int id, Employee employee)
	{
		String sql = "update Employee set Name=?, AGE=?, SALARY=? where ID=?";
		jdbcTemplate.update(sql, employee.getName(), employee.getAge(), employee.getSalary(), id);
	}

	@Transactional(readOnly = true)
	public Employee getEmployee(int id)
	{
		String sql = "SELECT * FROM EMPLOYEE WHERE ID = ?";
		Employee employee = jdbcTemplate.queryForObject(sql, new Object[] { id },
				new EmployeeRowMapper());
		return employee;
	}

	@Transactional(readOnly = true)
	public List<Employee> getEmployees()
	{
		return jdbcTemplate.query("select * from EMPLOYEE", new EmployeeRowMapper());
	}

	@Transactional
	public void deleteEmployee(int id)
	{
		String sql = "DELETE FROM EMPLOYEE WHERE ID=?";
		jdbcTemplate.update(sql, id);
	}

	public boolean isEmployeeExist(int id)
	{
		String sql = "SELECT COUNT(*) FROM EMPLOYEE where id=?";

		int count = jdbcTemplate.queryForObject(sql, new Object[] { id }, Integer.class);
		if (count >= 1)
		{
			return true;
		}
		return false;
	}

}
