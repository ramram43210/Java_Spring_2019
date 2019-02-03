package com.ram;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageConsumerApp
{
	final static String queueName = "message_queue";

	public static void main(String[] args) throws InterruptedException
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(RabbitMQConfig.class);
		ctx.refresh();
		MessageReceiver receiver = (MessageReceiver) ctx
				.getBean("receiver");
		receiver.getCountDownLatch().await(20000, TimeUnit.SECONDS);
		ctx.close();
	}
}
