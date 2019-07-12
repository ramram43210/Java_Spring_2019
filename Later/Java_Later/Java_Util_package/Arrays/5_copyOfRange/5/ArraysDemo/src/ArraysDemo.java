import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		float[] floatArray1 = new float[] { 5.5f, 10.1f, 15.4f };

		System.out.println("Printing floatArray1:");
		printArrayDetails(floatArray1);

		/*
		 * Copies the specified range of the specified array floato a
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

		float[] floatArray2 = Arrays.copyOfRange(floatArray1, 1, 5);

		System.out.println("\nPrinting floatArray2:");
		printArrayDetails(floatArray2);

	}

	private static void printArrayDetails(float[] floatArray)
	{
		float i = 0;
		for (float floatValue : floatArray)
		{
			System.out.println("floatArray[" + i + "] = " + floatValue);
			++i;
		}
	}

}
