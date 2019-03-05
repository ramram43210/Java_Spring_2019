package com.ram;

import java.util.concurrent.CountDownLatch;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver implements ChannelAwareMessageListener
{

	private CountDownLatch latch = new CountDownLatch(1);

	@Override
	public void onMessage(Message message, com.rabbitmq.client.Channel channel) throws Exception
	{
		System.out.println("Received <" + new String(message.getBody()) + ">");
		channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
		latch.countDown();
	}

	public CountDownLatch getLatch()
	{
		return latch;
	}

}