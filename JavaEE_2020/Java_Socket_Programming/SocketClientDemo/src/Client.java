import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client
{
	public static void main(String[] args)
	{
		Socket socket = null;
		DataOutputStream dout = null;
		try
		{
			/*
			 * Creates a stream socket and connects it to the
			 * specified port number at the specified IP address.
			 */
			socket = new Socket("localhost", 6666);

			/*
			 * returns the OutputStream attached with this socket.
			 */
			OutputStream outputStream = socket.getOutputStream();
			dout = new DataOutputStream(outputStream);
			dout.writeUTF("Hello Server");
			System.out.println("Client sent the message to server ");
			dout.flush();

		}
		catch (Exception exe)
		{
			exe.printStackTrace();
		}
		finally
		{
			try
			{
				if (dout != null)
				{
					dout.close();
				}
				if (socket != null)
				{
					/*
					 * closes this socket
					 */
					socket.close();
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}