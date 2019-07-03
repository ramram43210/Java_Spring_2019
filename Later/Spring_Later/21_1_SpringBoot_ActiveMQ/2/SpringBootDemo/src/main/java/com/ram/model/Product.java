package com.ram.model;

import java.io.Serializable;

public class Product implements Serializable
{
	private int productId;
	private String name;
	private int quantity;

	public int getProductId()
	{
		return productId;
	}

	public void setProductId(int productId)
	{
		this.productId = productId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	@Override
	public String toString()
	{
		return "Product [productId=" + productId + ", name=" + name + ", quantity=" + quantity
				+ "]";
	}

}
