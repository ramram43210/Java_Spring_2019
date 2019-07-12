import java.util.Random;
import java.util.stream.IntStream;

public class RandomDemo1
{

	public static void main(String[] args)
	{
		Random random = new Random();

		/*
		 * Returns an effectively unlimited stream of pseudorandom int
		 * values, each conforming to the given origin (inclusive) and
		 * bound (exclusive).
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
		 * a stream of pseudorandom int values, each with the given
		 * origin (inclusive) and bound (exclusive)
		 * 
		 * 
		 */
		IntStream intStream = random.ints(1, 5);

		intStream.forEach(System.out::println);

	}

}
