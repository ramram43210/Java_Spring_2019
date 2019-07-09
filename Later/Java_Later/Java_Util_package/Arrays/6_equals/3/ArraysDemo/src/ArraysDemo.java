import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		long[] longArray1 = new long[] { 1, 2, 3, 4 };
		long[] longArray2 = new long[] { 1, 2, 3, 4 };
		long[] longArray3 = new long[] { 10, 11, 12, 13 };

		/*
		 * Returns true if the two specified arrays of longs are equal
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
		boolean isEqual = Arrays.equals(longArray1, longArray2);
		System.out.println("is longArray1 equal to longArray2? =  " + isEqual);

		isEqual = Arrays.equals(longArray1, longArray3);
		System.out.println("is longArray1 equal to longArray3? =  " + isEqual);

	}

}
