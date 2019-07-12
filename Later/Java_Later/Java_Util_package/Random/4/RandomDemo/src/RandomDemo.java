import java.util.Random;

public class RandomDemo
{

	public static void main(String[] args)
	{

		Random randomno = new Random();

		byte[] byteArray = new byte[5];

		System.out.println(
				"------------- Before, nextBytes method is called ------------");

		for (byte b : byteArray)
		{
			System.out.println(b);
		}

		/*
		 * Generates random bytes and places them into a user-supplied
		 * byte array. The number of random bytes produced is equal to
		 * the length of the byte array.
		 *
		 * Parameters:
		 *
		 * bytes - the byte array to fill with random bytes
		 *
		 */
		randomno.nextBytes(byteArray);

		System.out.println(
				"------------- After, nextBytes method is called ------------");

		for (byte b : byteArray)
		{
			System.out.println(b);
		}

	}

}
