package com.ram.core.model;

public class Company
{
	private Integer id;

	private String companyName;

	private String ceoName;

	private Integer numberOfEmployees;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
		
	}

	public String getCompanyName()
	{
		return companyName;
	}

	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}

	public String getCeoName()
	{
		return ceoName;
	}

	public void setCeoName(String ceoName)
	{
		this.ceoName = ceoName;
	}

	public Integer getNumberOfEmployees()
	{
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees)
	{
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public String toString()
	{
		return "Company [id=" + id + ", companyName=" + companyName
				+ ", ceoName=" + ceoName + ", numberOfEmployees="
				+ numberOfEmployees + "]";
	}

}