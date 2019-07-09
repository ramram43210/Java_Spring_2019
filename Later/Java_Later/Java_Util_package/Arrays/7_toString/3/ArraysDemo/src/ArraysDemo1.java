import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{
		float[] floatArray = new float[] { 10.1f, 15.5f, 20.3f };

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
		String strFloatArray = Arrays.toString(floatArray);
		System.out.println(strFloatArray);
	}

}
