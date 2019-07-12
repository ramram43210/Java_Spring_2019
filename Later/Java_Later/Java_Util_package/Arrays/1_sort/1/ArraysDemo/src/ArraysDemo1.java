import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		byte[] byteArray = { 5, 2, 7, 3, 9 };

		/*
		 * Sorts the specified array into ascending numerical order.
		 * 
		 * Parameters:
		 * 
		 * a - the array to be sorted
		 * 
		 */
		Arrays.sort(byteArray);

		System.out.println("The sorted int array is:");
		int i = 0;
		for (byte number : byteArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}

	}

}
