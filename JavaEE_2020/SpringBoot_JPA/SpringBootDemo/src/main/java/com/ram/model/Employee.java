package com.ram.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity  
public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
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
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary
				+ "]";
	}

}
