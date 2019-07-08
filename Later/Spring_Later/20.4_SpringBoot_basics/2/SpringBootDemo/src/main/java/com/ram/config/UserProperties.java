package com.ram.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("user")
public class UserProperties
{
	private String userName;
	private int age;
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
