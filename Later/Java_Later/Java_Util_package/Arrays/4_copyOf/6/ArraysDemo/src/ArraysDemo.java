import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		double[] doubleArray1 = new double[] { 3.2, 5.5, 2.4 };

		System.out.println("Printing doubleArray1:");
		printArrayDetails(doubleArray1);

		/*
		 * Copies the specified array, truncating or padding with
		 * zeros (if necessary) so the copy has the specified length.
		 * 
		 * Parameters:
		 * 
		 * original - the array to be copied
		 * 
		 * newLength - the length of the copy to be returned
		 * 
		 * Returns:
		 * 
		 * a copy of the original array, truncated or padded with
		 * zeros to obtain the specified length
		 */

		double[] doubleArray2 = Arrays.copyOf(doubleArray1, 3);

		System.out.println("\nPrinting doubleArray2:");
		printArrayDetails(doubleArray2);

	}

	private static void printArrayDetails(double[] doubleArray)
	{
		int i = 0;
		for (double doubleValue : doubleArray)
		{
			System.out.println("doubleArray["+ i +"] = " + doubleValue);
			++i;
		}
	}

}
