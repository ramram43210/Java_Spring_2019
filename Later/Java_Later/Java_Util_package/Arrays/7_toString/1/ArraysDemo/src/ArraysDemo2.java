import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{
		short[] shortArray = new short[] { 101, 102, 103};

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
		String strShortArray = Arrays.toString(shortArray);
		System.out.println(strShortArray);
	}

}
