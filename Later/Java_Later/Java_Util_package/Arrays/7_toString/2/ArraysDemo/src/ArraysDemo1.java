import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{
		int[] intArray = new int[] { 10, 15, 20 };

		/*
		 * Returns a string representation of the contents of the
		 * specified array.
		 * 
		 * Parameters:
		 * 
		 * a - the array whose string representation to return
		 * 
		 * Returns:
		 * 
		 * a string representation of a
		 */
		String strIntArray = Arrays.toString(intArray);
		System.out.println(strIntArray);
	}

}
