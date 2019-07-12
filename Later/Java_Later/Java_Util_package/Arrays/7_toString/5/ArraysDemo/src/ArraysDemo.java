import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		Integer[] IntegerArray = new Integer[]  { 22, 33, 44 };

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
		String strIntegerArray = Arrays.toString(IntegerArray);
		System.out.println(strIntegerArray);
	}

}
