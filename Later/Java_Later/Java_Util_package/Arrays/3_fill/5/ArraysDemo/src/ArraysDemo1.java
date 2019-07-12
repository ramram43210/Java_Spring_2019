import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		float[] floatArray = new float[] { 2.1f, 7.2f, 9.4f, 1.4f, 6.5f };

		System.out.println("Actual values: ");
		prfloatArrayDetails(floatArray);

		/*
		 * Assigns the specified float value to each element of the
		 * specified array of floats.
		 * 
		 * Parameters:
		 * 
		 * a - the array to be filled
		 * 
		 * val - the value to be stored in all elements of the array
		 */

		float floatValue = 8.9f;
		Arrays.fill(floatArray, floatValue);

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
