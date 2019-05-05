package ram.jms;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/*
 * This class is used to send a text message to the queue.
 */
public class MessageSender
{

	private final static String QUEUE_NAME = "Message_Queue";

	public static void main(String[] argv) throws Exception
	{
		ConnectionFactory factory = new ConnectionFactory();

		/*
		 * Here we connect to a broker on the local machine - hence
		 * the localhost. If we wanted to connect to a broker on a
		 * different machine we'd simply specify its name or IP
		 * address here.
		 */
		factory.setHost("localhost");
		try (
				Connection connection = factory.newConnection();
				Channel channel = connection.createChannel())

		{
			channel.queueDeclare(QUEUE_NAME, false, false, false,
					null);
			String message = "Hello World!";
			channel.basicPublish("", QUEUE_NAME, null,
					message.getBytes("UTF-8"));
			System.out.println(" [x] Sent '" + message + "'");
		}
		catch (Exception exe)
		{
			exe.printStackTrace();
		}

	}
}
