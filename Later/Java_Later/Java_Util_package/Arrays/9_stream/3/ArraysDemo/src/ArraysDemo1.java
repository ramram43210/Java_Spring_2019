import java.util.Arrays;
import java.util.stream.DoubleStream;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		double[] doubleArray = new double[] { 5.6, 15.5, 25.1, 35.3, 45.5 };

		/*
		 * Returns a sequential doubleStream with the specified array as
		 * its source.
		 * 
		 * Parameters:
		 * 
		 * array - the array, assumed to be unmodified during use
		 * 
		 * Returns:
		 * 
		 * an doubleStream for the array
		 */
		DoubleStream doubleStream = Arrays.stream(doubleArray);
		doubleStream.forEach(System.out::println);
	}

}
