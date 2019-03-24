package com.ram.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;

@Entity
@Table(name = "EMPLOYEE")
public class Employee
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "JOINING_DATE", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate joiningDate;

	@Column(name = "SALARY", nullable = false)
	private BigDecimal salary;

	@Column(name = "SSN", unique = true, nullable = false)
	private String ssn;

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

	public LocalDate getJoiningDate()
	{
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate)
	{
		this.joiningDate = joiningDate;
	}

	public BigDecimal getSalary()
	{
		return salary;
	}

	public void setSalary(BigDecimal salary)
	{
		this.salary = salary;
	}

	public String getSsn()
	{
		return ssn;
	}

	public void setSsn(String ssn)
	{
		this.ssn = ssn;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name
				+ ", joiningDate=" + joiningDate + ", salary="
				+ salary + ", ssn=" + ssn + "]";
	}

}
