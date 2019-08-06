package com.ram.config;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Configuration
@Validated
@ConfigurationProperties("user")
public class UserProperties
{
	@NotEmpty
	private String userName;

	@Max(70)
	@Min(1)
	private int age;

	@Max(70000)
	@Min(10000)
	private int salary;
	
	private List<String> emailList;

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public List<String> getEmailList()
	{
		return emailList;
	}

	public void setEmailList(List<String> emailList)
	{
		this.emailList = emailList;
	}

	@Override
	public String toString()
	{
		return "UserProperties [userName=" + userName + ", age=" + age + ", salary=" + salary
				+ ", emailList=" + emailList + "]";
	}

}
