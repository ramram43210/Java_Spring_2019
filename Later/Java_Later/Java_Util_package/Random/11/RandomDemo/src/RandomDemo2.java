import java.util.Random;
import java.util.stream.LongStream;

public class RandomDemo2
{

	public static void main(String[] args)
	{
		Random random = new Random();

		/*
		 * Returns a stream producing the given streamSize number of
		 * pseudorandom long values.
		 * 
		 * Parameters:
		 * 
		 * streamSize - the number of values to generate
		 * 
		 * Returns:
		 * 
		 * a stream of pseudorandom long values
		 * 
		 */
		LongStream longStream = random.longs(4);

		longStream.forEach(System.out::println);

	}

}
