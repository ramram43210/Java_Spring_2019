import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		double[] doubleArray1 = new double[] { 1.1, 2.2, 3.3, 4.4 };
		double[] doubleArray2 = new double[] { 1.1, 2.2, 3.3, 4.4 };
		double[] doubleArray3 = new double[] { 10.1, 11.1, 12.2, 13.3 };

		/*
		 * Returns true if the two specified arrays of doubles are
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
		boolean isEqual = Arrays.equals(doubleArray1, doubleArray2);
		System.out
				.println("is doubleArray1 equal to doubleArray2? =  " + isEqual);

		isEqual = Arrays.equals(doubleArray1, doubleArray3);
		System.out
				.println("is doubleArray1 equal to doubleArray3? =  " + isEqual);

	}

}
