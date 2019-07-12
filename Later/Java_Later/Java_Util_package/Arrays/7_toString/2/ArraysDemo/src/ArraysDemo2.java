import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{
		long[] longArray = new long[] { 101, 102, 103};

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
		String strLongArray = Arrays.toString(longArray);
		System.out.println(strLongArray);
	}

}
