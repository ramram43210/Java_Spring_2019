import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		String[][] multiDimensionalStrArray = { { "Hello ", " Peter" }, { "how ", "are you." } };

		/*
		 * Returns a string representation of the "deep contents" of the specified array.
		 * If the array contains other arrays as elements, the string representation
		 * contains their contents and so on. This method is designed for converting
		 * multidimensional arrays to strings.
		 */
		String strValue = Arrays.deepToString(multiDimensionalStrArray);
		System.out.println(strValue);
	}

}
