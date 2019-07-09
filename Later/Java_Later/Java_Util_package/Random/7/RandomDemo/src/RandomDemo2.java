import java.util.Random;
import java.util.stream.IntStream;

public class RandomDemo2
{

	public static void main(String[] args)
	{
		Random random = new Random();

		/*
		 * Returns a stream producing the given streamSize number of
		 * pseudorandom int values.
		 * 
		 * Parameters:
		 * 
		 * streamSize - the number of values to generate
		 * 
		 * Returns:
		 * 
		 * a stream of pseudorandom int values
		 * 
		 */
		IntStream intStream = random.ints(5);

		intStream.forEach(System.out::println);

	}

}
