import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		double[] doubleArray1 = new double[] { 5.5, 10.1, 15.4 };

		System.out.println("Printing doubleArray1:");
		printArrayDetails(doubleArray1);

		/*
		 * Copies the specified range of the specified array doubleo a
		 * new array.
		 *
		 * Parameters:
		 *
		 * original - the array from which a range is to be copied
		 * 
		 * from - the initial index of the range to be copied,
		 * inclusive
		 * 
		 * to - the final index of the range to be copied, exclusive.
		 * (This index may lie outside the array.)
		 *
		 * Returns:
		 *
		 * a new array containing the specified range from the
		 * original array, truncated or padded with zeros to obtain
		 * the required length
		 */

		double[] doubleArray2 = Arrays.copyOfRange(doubleArray1, 1, 5);

		System.out.println("\nPrinting doubleArray2:");
		printArrayDetails(doubleArray2);

	}

	private static void printArrayDetails(double[] doubleArray)
	{
		double i = 0;
		for (double doubleValue : doubleArray)
		{
			System.out.println("doubleArray[" + i + "] = " + doubleValue);
			++i;
		}
	}

}
