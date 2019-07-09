import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		int[] intArray = new int[] { 5, 15, 25, 35, 45 };

		/*
		 * Returns a sequential IntStream with the specified range of
		 * the specified array as its source.
		 * 
		 * Parameters:
		 * 
		 * array - the array, assumed to be unmodified during use
		 * 
		 * startInclusive - the first index to cover, inclusive
		 * 
		 * endExclusive - index immediately past the last index to
		 * cover
		 * 
		 * Returns:
		 * 
		 * an IntStream for the array range
		 */
		IntStream intStream = Arrays.stream(intArray, 1, 3);
		intStream.forEach(System.out::println);
	}

}
