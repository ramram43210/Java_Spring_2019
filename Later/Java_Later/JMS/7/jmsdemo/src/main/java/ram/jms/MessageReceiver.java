package ram.jms;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

/*
 * This class is used to receive the text message from the queue.
 */
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
		System.out.println(
				" [*] Waiting for messages. To exit press CTRL+C");

		/*
		 * We're about to tell the server to deliver us the messages
		 * from the queue. Since it will push us messages
		 * asynchronously, we provide a callback in the form of an
		 * object that will buffer the messages until we're ready to
		 * use them. That is what a DeliverCallback subclass does.
		 */
		DeliverCallback deliverCallback = (consumerTag, delivery) -> {
			String message = new String(delivery.getBody(), "UTF-8");
			System.out.println(" [x] Received '" + message + "'");
		};
		channel.basicConsume(QUEUE_NAME, true, deliverCallback,
				consumerTag -> {
				});
		
	}
}
