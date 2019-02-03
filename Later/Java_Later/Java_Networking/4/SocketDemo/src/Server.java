import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{

	public static void main(String[] args)
	{
		ServerSocket serverSocket = null;
		try
		{
			/*
			 * Creates a server socket, bound to the specified port.
			 */
			serverSocket = new ServerSocket(6666);
			System.out.println(
					"Server is Waiting for client request... ");

			/*
			 * Listens for a connection to be made to this socket and
			 * accepts it. The method blocks until a connection is
			 * made.
			 */
			Socket s = serverSocket.accept();
			DataInputStream dis = new DataInputStream(
					s.getInputStream());
			String str = (String) dis.readUTF();
			System.out.println(
					"Server received message from by client is = "
							+ str);
		}
		catch (Exception exe)
		{
			exe.printStackTrace();
		}
		finally
		{
			try
			{
				if (serverSocket != null)
				{
					/*
					 * closes the server socket.
					 */
					serverSocket.close();
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
