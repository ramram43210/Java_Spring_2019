package ram.jms;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

import ram.model.Product;

public class MessageReceiver
{
	private final static String QUEUE_NAME = "Message_Queue";

	public static void main(String[] argv) throws Exception
	{
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();

		channel.queueDeclare(QUEUE_NAME, false, false, false, null);
		System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

		/*
		 * We're about to tell the server to deliver us the messages from the queue. Since it will
		 * push us messages asynchronously, we provide a callback in the form of an object that will
		 * buffer the messages until we're ready to use them. That is what a DeliverCallback
		 * subclass does.
		 */
		DeliverCallback deliverCallback = (consumerTag, delivery) -> {
			byte[] byteArray = delivery.getBody();

			try
			{
				Product product = (Product) deserialize(byteArray);
				System.out.println(" [x] Received '" + product + "'");
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}

		};
		channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> {
		});

	}

	public static Object deserialize(byte[] byteArray) throws IOException, ClassNotFoundException
	{
		ByteArrayInputStream in = new ByteArrayInputStream(byteArray);
		ObjectInputStream is = new ObjectInputStream(in);
		return is.readObject();
	}
}
