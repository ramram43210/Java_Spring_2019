import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{
		boolean[] booleanArray = new boolean[] { true, false, true };

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
		String strBooleanArray = Arrays.toString(booleanArray);
		System.out.println(strBooleanArray);
	}

}
