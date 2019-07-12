import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		long[] longArray = { 5, 2, 7, 3, 9 };

		/*
		 * Sorts the specified array into ascending numerical order.
		 *
		 * Parameters:
		 *
		 * a - the array to be sorted
		 *
		 */
		Arrays.sort(longArray);

		System.out.println("The sorted long array is:");
		int i = 0;
		for (long number : longArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}

	}

}
