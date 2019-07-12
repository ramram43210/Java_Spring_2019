import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		Integer[] integerArray = new Integer[] { 5, 15, 25, 35, 45 };

		/*
		 * Returns a sequential IntegerStream with the specified range of
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
		 * an IntegerStream for the array range
		 */
		Stream<Integer> stream = Arrays.stream(integerArray, 1, 3);
		stream.forEach(System.out::println);
	}

}
