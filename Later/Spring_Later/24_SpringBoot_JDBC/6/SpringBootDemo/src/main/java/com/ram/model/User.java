package com.ram.model;

public class User
{
	private int id;
	private String name;
	private String emailId;
	private String gender;

	public User(String name, String emailId, String gender)
	{
		super();
		this.name = name;
		this.emailId = emailId;
		this.gender = gender;
	}

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

	public String getEmailId()
	{
		return emailId;
	}

	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	@Override
	public String toString()
	{
		return "User [id=" + id + ", name=" + name + ", emailId=" + emailId + ", gender=" + gender
				+ "]";
	}

}
