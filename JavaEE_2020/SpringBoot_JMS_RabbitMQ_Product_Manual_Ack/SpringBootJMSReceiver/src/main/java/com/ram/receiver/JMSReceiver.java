package com.ram.receiver;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

import com.ram.model.Product;

@Component
public class JMSReceiver implements ChannelAwareMessageListener
{

	@Override
	public void onMessage(Message message, com.rabbitmq.client.Channel channel) throws Exception
	{
		System.out.println("Received <" + message + ">");

		byte[] byteArray = message.getBody();
		Product product = (Product) getObject(byteArray);
		System.out.println("product = " + product);
		
		/**
		 * Suppose say here we are storing product details in the table
		 * and some exception occured then what we can do is do not acknowledge
		 * to Queue, so that it will be in queue and later we can pick up
		 * the same product from the queue and process it
		 */
		/*
		 * Positively acknowledge a single delivery, the message will be discarded
		 */
		channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
	}

	/* De serialize the byte array to object */
	private static Object getObject(byte[] byteArr) throws IOException, ClassNotFoundException
	{
		ByteArrayInputStream bis = new ByteArrayInputStream(byteArr);
		ObjectInput in = new ObjectInputStream(bis);
		return in.readObject();
	}
}
