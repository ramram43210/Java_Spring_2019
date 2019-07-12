import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		 char[] charArray = {'d','b','e','a','c'};

		/*
		 * Sorts the specified range of the array into ascending
		 * order. The range to be sorted extends from the index
		 * fromIndex, inclusive, to the index toIndex, exclusive. If
		 * fromIndex == toIndex, the range to be sorted is empty.
		 * 
		 * Parameters:
		 * 
		 * a - the array to be sorted
		 * 
		 * fromIndex - the index of the first element, inclusive, to
		 * be sorted
		 * 
		 * toIndex - the index of the last element, exclusive, to be
		 * sorted
		 * 
		 */
		Arrays.sort(charArray, 2, 4);

		System.out.println("The sorted Object array is:");
		int i = 0;
		for (char ch : charArray)
		{
			System.out.println("Index = " + i + ", Number = " + ch);
			++i;
		}
	}

}
