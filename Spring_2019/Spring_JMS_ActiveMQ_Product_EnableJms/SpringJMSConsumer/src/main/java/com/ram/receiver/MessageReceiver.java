package com.ram.receiver;

import javax.jms.JMSException;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

import com.ram.model.Product;

@Component
public class MessageReceiver
{
	private static final String MESSAGE_QUEUE = "message_queue";

	@JmsListener(destination = MESSAGE_QUEUE)
	public void receiveMessage(final Message<Product> message)
			throws JMSException
	{
		MessageHeaders headers = message.getHeaders();
		System.out.println("headers = " + headers);

		Product product = message.getPayload();
		System.out.println("product = " + product);

	}

}
