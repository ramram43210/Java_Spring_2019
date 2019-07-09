import java.util.Arrays;
import java.util.stream.LongStream;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		long[] longArray = new long[] { 5, 15, 25, 35, 45 };

		/*
		 * Returns a sequential longStream with the specified array as
		 * its source.
		 * 
		 * Parameters:
		 * 
		 * array - the array, assumed to be unmodified during use
		 * 
		 * Returns:
		 * 
		 * an longStream for the array
		 */
		LongStream longStream = Arrays.stream(longArray);
		longStream.forEach(System.out::println);
	}

}
