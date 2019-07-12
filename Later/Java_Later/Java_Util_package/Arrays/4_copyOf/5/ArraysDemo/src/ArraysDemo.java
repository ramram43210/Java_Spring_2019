import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		float[] floatArray1 = new float[] { 3.2f, 5.5f, 2.4f };

		System.out.println("Printing floatArray1:");
		printArrayDetails(floatArray1);

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

		float[] floatArray2 = Arrays.copyOf(floatArray1, 3);

		System.out.println("\nPrinting floatArray2:");
		printArrayDetails(floatArray2);

	}

	private static void printArrayDetails(float[] floatArray)
	{
		int i = 0;
		for (float floatValue : floatArray)
		{
			System.out.println("floatArray["+ i +"] = " + floatValue);
			++i;
		}
	}

}
