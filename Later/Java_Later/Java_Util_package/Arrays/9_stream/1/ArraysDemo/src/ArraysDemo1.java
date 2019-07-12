import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		int[] intArray = new int[] { 5, 15, 25, 35, 45 };

		/*
		 * Returns a sequential IntStream with the specified array as
		 * its source.
		 * 
		 * Parameters:
		 * 
		 * array - the array, assumed to be unmodified during use
		 * 
		 * Returns:
		 * 
		 * an IntStream for the array
		 */
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(System.out::println);
	}

}
