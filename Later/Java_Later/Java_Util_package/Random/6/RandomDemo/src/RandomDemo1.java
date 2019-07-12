import java.util.Random;
import java.util.stream.DoubleStream;

public class RandomDemo1
{

	public static void main(String[] args)
	{
		Random random = new Random();

		/*
		 * Returns an effectively unlimited stream of pseudorandom
		 * double values, each conforming to the given origin
		 * (inclusive) and bound (exclusive).
		 * 
		 * Parameters:
		 * 
		 * randomNumberOrigin - the origin (inclusive) of each random
		 * value
		 * 
		 * randomNumberBound - the bound (exclusive) of each random
		 * value
		 * 
		 * Returns:
		 * 
		 * a stream of pseudorandom double values, each with the given
		 * origin (inclusive) and bound (exclusive)
		 * 
		 * 
		 */
		DoubleStream doubleStream = random.doubles(5, 8);

		doubleStream.forEach(System.out::println);

	}

}
