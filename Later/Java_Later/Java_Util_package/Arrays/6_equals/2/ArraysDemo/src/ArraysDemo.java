import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		int[] intArray1 = new int[] { 1, 2, 3, 4 };
		int[] intArray2 = new int[] { 1, 2, 3, 4 };
		int[] intArray3 = new int[] { 10, 11, 12, 13 };

		/*
		 * Returns true if the two specified arrays of ints are equal
		 * to one another.
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
		boolean isEqual = Arrays.equals(intArray1, intArray2);
		System.out.println("is intArray1 equal to intArray2? =  " + isEqual);

		isEqual = Arrays.equals(intArray1, intArray3);
		System.out.println("is intArray1 equal to intArray3? =  " + isEqual);

	}

}
