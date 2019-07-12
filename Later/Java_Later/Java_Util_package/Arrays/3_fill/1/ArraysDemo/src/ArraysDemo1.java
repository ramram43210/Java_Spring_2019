import java.util.Arrays;

check next example

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		byte byteArray[] = new byte[] { 2, 7, 9, 7, 8 };

		System.out.println("Actual values: ");
		for (byte value : byteArray)
		{
			System.out.println("Value = " + value);
		}

		/*
		 * Assigns the specified byte value to each element of the
		 * specified array of bytes.
		 *
		 * Parameters:a - the array to be filled
		 *
		 * val - the value to be stored in all elements of the array
		 */
		Arrays.fill(byteArray, (byte) 8);

		System.out.println("New values after using fill() method: ");

		for (byte value : byteArray)
		{
			System.out.println("Value = " + value);
		}

	}

}
