package com.ram.service;

import com.ram.model.ProductOrder;

public interface OrderService
{
	public void sendOrderConfirmation(ProductOrder productOrder);
}
