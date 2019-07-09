import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		double[] doubleArray = new double[] { 2.1, 7.2, 9.4, 1.4, 6.5 };
		
		System.out.println("Actual values: ");
		prdoubleArrayDetails(doubleArray);

		/*
		 * Assigns the specified double value to each element of the
		 * specified range of the specified array of doubles. The range
		 * to be filled extends from index fromIndex, inclusive, to
		 * index toIndex, exclusive. (If fromIndex==toIndex, the range
		 * to be filled is empty.)
		 * 
		 * Parameters:
		 * 
		 * a - the array to be filled
		 * 
		 * fromIndex - the index of the first element (inclusive) to
		 * be filled with the specified value
		 * 
		 * toIndex - the index of the last element (exclusive) to be
		 * filled with the specified value
		 * 
		 * val - the value to be stored in all elements of the array
		 */

		double doubleValue = 8.9;
		Arrays.fill(doubleArray, 1, 3, doubleValue);

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
