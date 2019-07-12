import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{
		double[] doubleArray = new double[] { 10.1, 15.5, 20.3 };

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
		String strDoubleArray = Arrays.toString(doubleArray);
		System.out.println(strDoubleArray);
	}

}
