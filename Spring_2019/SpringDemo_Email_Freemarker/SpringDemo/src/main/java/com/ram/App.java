package com.ram;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ram.configuration.AppConfig;
import com.ram.model.CustomerInfo;
import com.ram.model.ProductOrder;
import com.ram.service.OrderService;

public class App
{

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		OrderService orderService = (OrderService) context.getBean("orderService");
		
		orderService.sendOrderConfirmation(getDummyOrder());
		
		((AbstractApplicationContext) context).close();
	}

	public static ProductOrder getDummyOrder()
	{
		ProductOrder order = new ProductOrder();
		order.setOrderId("5123");
		order.setProductName("Thinkpad Laptop");
		order.setStatus("Confirmed");

		CustomerInfo customerInfo = new CustomerInfo();
		customerInfo.setName("Peter");
		customerInfo.setAddress("25, West Street, Bangalore");
		customerInfo.setEmail("testram4321@gmail.com");
		order.setCustomerInfo(customerInfo);
		return order;
	}

}
