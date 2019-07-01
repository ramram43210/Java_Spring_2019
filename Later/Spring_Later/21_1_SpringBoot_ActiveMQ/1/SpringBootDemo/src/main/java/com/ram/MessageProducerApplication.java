package com.ram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

import com.ram.model.Product;

@SpringBootApplication
@EnableJms
public class MessageProducerApplication
{

	private static final String MESSAGE_QUEUE = "message_queue";

	public static void main(String[] args)
	{
		// Launch the application
		ConfigurableApplicationContext context = SpringApplication.run(MessageProducerApplication.class, args);

		// Get JMS template bean reference
		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);

		Product product = new Product();
		product.setProductId(100);
		product.setName("Laptop");
		product.setQuantity(10);

		// Send a message
		System.out.println("Sending a product.");
		jmsTemplate.convertAndSend(MESSAGE_QUEUE, product);
	}

}
