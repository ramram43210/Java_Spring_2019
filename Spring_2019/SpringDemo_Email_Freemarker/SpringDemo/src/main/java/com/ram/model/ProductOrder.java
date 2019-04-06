package com.ram.model;

public class ProductOrder
{
	private String orderId;
	private String productName;
	private String status;
	private CustomerInfo customerInfo;

	public String getOrderId()
	{
		return orderId;
	}

	public void setOrderId(String orderId)
	{
		this.orderId = orderId;
	}

	public String getProductName()
	{
		return productName;
	}

	public void setProductName(String productName)
	{
		this.productName = productName;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public CustomerInfo getCustomerInfo()
	{
		return customerInfo;
	}

	public void setCustomerInfo(CustomerInfo customerInfo)
	{
		this.customerInfo = customerInfo;
	}

	@Override
	public String toString()
	{
		return "ProductOrder [orderId=" + orderId + ", productName="
				+ productName + ", status=" + status
				+ ", customerInfo=" + customerInfo + "]";
	}

}