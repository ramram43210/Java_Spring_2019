package com.ram.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee
{
	private int id;

	@NotNull(message = "name cannot be null")
	@Size(min = 4, max = 8, message = "name must be minimum 4 characters and maximum 8 characters")
	private String name;

	@NotNull(message = "email cannot be null")
	@Email
	private String email;

	@NotNull(message = "age cannot be null")
	private int age;

	@NotNull(message = "salary cannot be null")
	private int salary;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
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

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age
				+ ", salary=" + salary + "]";
	}

}
