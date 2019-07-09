import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		double[] doubleArray = new double[] { 2.1, 7.2, 9.4, 1.4, 6.5 };

		System.out.println("Actual values: ");
		prdoubleArrayDetails(doubleArray);

		/*
		 * Assigns the specified double value to each element of the
		 * specified array of doubles.
		 * 
		 * Parameters:
		 * 
		 * a - the array to be filled
		 * 
		 * val - the value to be stored in all elements of the array
		 */

		double doubleValue = 8.9;
		Arrays.fill(doubleArray, doubleValue);

		System.out.println("\nNew values after using fill() method: ");

		prdoubleArrayDetails(doubleArray);

	}

	private static void prdoubleArrayDetails(double[] doubleArray)
	{
		for (double value : doubleArray)
		{
			System.out.println("Value = " + value);
		}
	}

}
