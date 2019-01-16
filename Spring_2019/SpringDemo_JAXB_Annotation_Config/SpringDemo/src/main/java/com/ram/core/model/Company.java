package com.ram.core.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CompanyInfo", namespace = "com.ram.core")
@XmlAccessorType(XmlAccessType.NONE)
public class Company
{
	@XmlAttribute(name = "Id")
	private Integer id;

	@XmlElement(name = "CompanyName")
	private String companyName;

	@XmlElement(name = "CEO_Name")
	private String ceoName;

	@XmlElement(name = "Number_Of_Employees")
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