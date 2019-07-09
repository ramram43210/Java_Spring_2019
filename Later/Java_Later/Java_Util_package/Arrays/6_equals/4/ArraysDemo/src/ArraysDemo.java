import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		short[] shortArray1 = new short[] { 1, 2, 3, 4 };
		short[] shortArray2 = new short[] { 1, 2, 3, 4 };
		short[] shortArray3 = new short[] { 10, 11, 12, 13 };

		/*
		 * Returns true if the two specified arrays of shorts are equal
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
		boolean isEqual = Arrays.equals(shortArray1, shortArray2);
		System.out.println("is shortArray1 equal to shortArray2? =  " + isEqual);

		isEqual = Arrays.equals(shortArray1, shortArray3);
		System.out.println("is shortArray1 equal to shortArray3? =  " + isEqual);

	}

}
