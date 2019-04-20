package com.ram;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ram.config.AppConfig;
import com.ram.model.Product;
import com.ram.receiver.MessageReceiver;

public class MessageConsumerApp
{

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		MessageReceiver messageReceiver = (MessageReceiver) context.getBean("messageReceiver");
		Product product = messageReceiver.receiveMessage();
		System.out.println("Message Received = " + product);

		((AbstractApplicationContext) context).close();
	}

}
