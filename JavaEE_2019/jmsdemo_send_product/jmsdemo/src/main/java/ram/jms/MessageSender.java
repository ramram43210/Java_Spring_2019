package ram.jms;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import ram.model.Product;

public class MessageSender
{

	private final static String QUEUE_NAME = "Message_Queue";

	public static void main(String[] argv) throws Exception
	{
		ConnectionFactory factory = new ConnectionFactory();

		/*
		 * Here we connect to a broker on the local machine - hence the localhost. If we wanted to
		 * connect to a broker on a different machine we'd simply specify its name or IP address
		 * here.
		 */
		factory.setHost("localhost");
		try (
				Connection connection = factory.newConnection();
				Channel channel = connection.createChannel())

		{
			channel.queueDeclare(QUEUE_NAME, false, false, false, null);
			
			Product product = new Product();
			product.setProductId(100);
			product.setName("Laptop");
			product.setQuantity(10);

			byte[] byteArray = getByteArray(product);

			channel.basicPublish("", QUEUE_NAME, null, byteArray);
			System.out.println(" [x] Sent '" + product + "'");
		}
		catch (Exception exe)
		{
			exe.printStackTrace();
		}

	}

	public static byte[] getByteArray(Product product) throws IOException
	{
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ObjectOutputStream os = new ObjectOutputStream(out);
		os.writeObject(product);
		return out.toByteArray();
	}

}
