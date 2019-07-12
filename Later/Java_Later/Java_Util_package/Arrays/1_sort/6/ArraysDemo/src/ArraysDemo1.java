import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		double[] doubleArray = { 5.2f, 2.3f, 7.6f, 3.4f, 9.8f };

		/*
		 * Sorts the specified array into ascending numerical order.
		 *
		 * Parameters:
		 *
		 * a - the array to be sorted
		 *
		 */
		Arrays.sort(doubleArray);

		System.out.println("The sorted double array is:");
		int i = 0;
		for (double number : doubleArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}

	}

}
