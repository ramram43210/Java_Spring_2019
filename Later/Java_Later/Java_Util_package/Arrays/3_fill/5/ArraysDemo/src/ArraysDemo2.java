import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		float[] floatArray = new float[] { 2.1f, 7.2f, 9.4f, 1.4f, 6.5f };
		
		System.out.println("Actual values: ");
		prfloatArrayDetails(floatArray);

		/*
		 * Assigns the specified float value to each element of the
		 * specified range of the specified array of floats. The range
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

		float floatValue = 8.9f;
		Arrays.fill(floatArray, 1, 3, floatValue);

		System.out.println("\nNew values after using fill() method: ");

		prfloatArrayDetails(floatArray);
	}

	private static void prfloatArrayDetails(float[] floatArray)
	{
		for (float value : floatArray)
		{
			System.out.println("Value = " + value);
		}
	}

}
