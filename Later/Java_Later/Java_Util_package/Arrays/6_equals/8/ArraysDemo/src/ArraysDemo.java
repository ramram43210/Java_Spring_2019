import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		boolean[] booleanArray1 = new boolean[] { true, true, true };
		boolean[] booleanArray2 = new boolean[] { true, true, true };
		boolean[] booleanArray3 = new boolean[] { false, false, false };

		/*
		 * Returns true if the two specified arrays of booleans are
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
		boolean isEqual = Arrays.equals(booleanArray1, booleanArray2);
		System.out.println(
				"is booleanArray1 equal to booleanArray2? =  " + isEqual);

		isEqual = Arrays.equals(booleanArray1, booleanArray3);
		System.out.println(
				"is booleanArray1 equal to booleanArray3? =  " + isEqual);

	}

}
