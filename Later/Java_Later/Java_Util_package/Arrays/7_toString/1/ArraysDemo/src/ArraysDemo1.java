import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{
		byte[] byteArray = new byte[] { 10, 15, 20 };

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
		String strByteArray = Arrays.toString(byteArray);
		System.out.println(strByteArray);
	}

}
