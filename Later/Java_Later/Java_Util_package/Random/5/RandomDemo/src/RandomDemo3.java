import java.util.Random;
import java.util.stream.DoubleStream;

public class RandomDemo
{

	public static void main(String[] args)
	{
		Random random = new Random();

		/*
		 * Returns a stream producing the given streamSize number of
		 * pseudorandom double values, each between zero (inclusive)
		 * and one (exclusive).
		 * 
		 * Parameters:
		 * 
		 * streamSize - the number of values to generate
		 * 
		 * Returns:
		 * 
		 * a stream of double values
		 * 
		 */
		DoubleStream doubleStream = random.doubles(10);

		doubleStream.forEach(System.out::println);

	}

}
