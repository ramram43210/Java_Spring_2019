import java.util.Arrays;
import java.util.stream.DoubleStream;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		double[] doubleArray = new double[] { 5.6, 15.5, 25.1, 35.3, 45.5 };

		/*
		 * Returns a sequential doubleStream with the specified range of
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
		 * an doubleStream for the array range
		 */
		DoubleStream doubleStream = Arrays.stream(doubleArray, 1, 3);
		doubleStream.forEach(System.out::println);
	}

}
