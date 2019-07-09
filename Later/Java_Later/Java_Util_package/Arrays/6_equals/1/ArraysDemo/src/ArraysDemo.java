import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		byte[] byteArray1 = new byte[] { 1, 2, 3, 4 };
		byte[] byteArray2 = new byte[] { 1, 2, 3, 4 };
		byte[] byteArray3 = new byte[] { 10, 11, 12, 13 };

		/*
		 * Returns true if the two specified arrays of bytes are equal
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
		boolean isEqual = Arrays.equals(byteArray1, byteArray2);
		System.out.println("is byteArray1 equal to byteArray2? =  " + isEqual);

		isEqual = Arrays.equals(byteArray1, byteArray3);
		System.out.println("is byteArray1 equal to byteArray3? =  " + isEqual);

	}

}
