package com.ram.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.ram.model.User;

@Repository
public class UserRepository
{
	@Autowired
    private JdbcTemplate jdbcTemplateTwo;
	
	public void insert(User user)
	{
		String sql = "INSERT INTO USER " + "(NAME, EMAIL_ID,GENDER) VALUES (?, ?,?)";
		KeyHolder holder = new GeneratedKeyHolder();
		jdbcTemplateTwo.update(new PreparedStatementCreator()
		{
			@Override
			public PreparedStatement createPreparedStatement(Connection connection)
					throws SQLException
			{
				PreparedStatement ps = connection.prepareStatement(sql,
						Statement.RETURN_GENERATED_KEYS);
				ps.setString(1, user.getName());
				ps.setString(2, user.getEmailId());
				ps.setString(3, user.getGender());
				return ps;
			}
		}, holder);

		int generatedUserId = holder.getKey().intValue();
		System.out.println("generated userId = " + generatedUserId);
	}
}
