import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{
		char[] charArray = new char[]  { 'a', 'e', 'f' };

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
		String strCharArray = Arrays.toString(charArray);
		System.out.println(strCharArray);
	}

}
