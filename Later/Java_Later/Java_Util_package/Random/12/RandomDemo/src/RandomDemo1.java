import java.util.Random;
import java.util.stream.LongStream;

public class RandomDemo1
{

	public static void main(String[] args)
	{

		Random random = new Random();

		/*
		 * Returns an effectively unlimited stream of pseudorandom long values,
		 * each conforming to the given origin (inclusive) and bound
		 * (exclusive).
		 * 
		 * Parameters:
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
		LongStream longStream = random.longs(1, 5);

		longStream.forEach(System.out::println);

	}

}
