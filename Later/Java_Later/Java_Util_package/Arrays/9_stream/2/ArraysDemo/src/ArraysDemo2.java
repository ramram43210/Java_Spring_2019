import java.util.Arrays;
import java.util.stream.LongStream;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		long[] longArray = new long[] { 5, 15, 25, 35, 45 };

		/*
		 * Returns a sequential longStream with the specified range of
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
		 * an longStream for the array range
		 */
		LongStream longStream = Arrays.stream(longArray, 1, 3);
		longStream.forEach(System.out::println);
	}

}
