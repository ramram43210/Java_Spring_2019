package com.ram.securityconfig;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter
{
	@Autowired
	private DataSource ds;

	@Autowired
	public void configureAMBuilder(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.jdbcAuthentication().dataSource(ds)
				.authoritiesByUsernameQuery("select USERNAME, ROLE FROM USERS where USERNAME=?")
				.usersByUsernameQuery("select USERNAME,USERPASSWORD, 1 FROM USERS where USERNAME=?");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.httpBasic().and().authorizeRequests().anyRequest().authenticated();
		http.csrf().disable();
	}

	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}

}
