import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		short[] shortArray = new short[] { 2, 7, 9, 7, 8 };

		System.out.println("Actual values: ");
		printArrayDetails(shortArray);

		/*
		 * Assigns the specified short value to each element of the
		 * specified array of shorts.
		 * 
		 * Parameters:a - the array to be filled
		 * 
		 * val - the value to be stored in all elements of the array
		 */

		short shortValue = 8;
		Arrays.fill(shortArray, shortValue);

		System.out.println("\nNew values after using fill() method: ");

		printArrayDetails(shortArray);

	}

	private static void printArrayDetails(short[] shortArray)
	{
		for (short value : shortArray)
		{
			System.out.println("Value = " + value);
		}
	}

}
