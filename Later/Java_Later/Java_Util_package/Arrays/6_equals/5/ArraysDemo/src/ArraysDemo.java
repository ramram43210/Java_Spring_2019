import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		float[] floatArray1 = new float[] { 1.1f, 2.2f, 3.3f, 4.4f };
		float[] floatArray2 = new float[] { 1.1f, 2.2f, 3.3f, 4.4f };
		float[] floatArray3 = new float[] { 10.1f, 11.1f, 12.2f, 13.3f };

		/*
		 * Returns true if the two specified arrays of floats are
		 * equal to one another.
		 * 
		 * Parameters:
		 * 
		 * a - one array to be tested for equality
		 * 
		 * a2 - the other array to be tested for equality
		 * 
		 * Returns:
		 * 
		 * true if the two arrays are equal
		 */
		boolean isEqual = Arrays.equals(floatArray1, floatArray2);
		System.out
				.println("is floatArray1 equal to floatArray2? =  " + isEqual);

		isEqual = Arrays.equals(floatArray1, floatArray3);
		System.out
				.println("is floatArray1 equal to floatArray3? =  " + isEqual);

	}

}
