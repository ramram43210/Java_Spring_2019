package com.ram.batch;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.ram.model.Employee;

@Component
public class JobCompletionNotificationListener extends JobExecutionListenerSupport
{
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public JobCompletionNotificationListener(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void afterJob(JobExecution jobExecution)
	{

		if (jobExecution.getStatus() == BatchStatus.COMPLETED)
		{
			System.out.println(" -------- JOB FINISHED ------------------ ");

			List<Employee> results = jdbcTemplate.query("SELECT name,age,salary FROM employee",
					new RowMapper<Employee>()
					{

						@Override
						public Employee mapRow(ResultSet rs, int row) throws SQLException
						{
							return new Employee(rs.getString(1), rs.getInt(2),rs.getInt(3));
						}
					});

			for (Employee employee : results)
			{
				System.out.println("Found <" + employee + "> in the database.");
			}
		}

	}
}
