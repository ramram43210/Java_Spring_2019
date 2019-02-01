package com.ram;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageProducerApp
{
	final static String queueName = "message_queue";

	public static void main(String[] args) throws InterruptedException
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(RabbitMQConfig.class);
		ctx.refresh();
		RabbitTemplate rabbitTemplate = (RabbitTemplate) ctx
				.getBean("rabbitTemplate");
		
		System.out.println("Message has been sent successfully to Queue");
		rabbitTemplate.convertAndSend(queueName, "Hello World!");
		ctx.close();
	}
}
