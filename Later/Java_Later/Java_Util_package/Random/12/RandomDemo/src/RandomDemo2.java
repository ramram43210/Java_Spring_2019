import java.util.Random;
import java.util.stream.LongStream;

public class RandomDemo2
{

	public static void main(String[] args)
	{
		Random random = new Random();

		/*
		 * Returns a stream producing the given streamSize number of
		 * pseudorandom long, each conforming to the given origin (inclusive)
		 * and bound (exclusive).
		 * 
		 * Parameters:
		 *
		 * streamSize - the number of values to generate
		 * 
		 * randomNumberOrigin - the origin (inclusive) of each random value
		 * 
		 * randomNumberBound - the bound (exclusive) of each random value
		 * 
		 * Returns:
		 * 
		 * a stream of pseudorandom long values, each with the given origin
		 * (inclusive) and bound (exclusive)
		 * 
		 */
		LongStream longStream = random.longs(6, 1, 5);

		longStream.forEach(System.out::println);

	}

}
