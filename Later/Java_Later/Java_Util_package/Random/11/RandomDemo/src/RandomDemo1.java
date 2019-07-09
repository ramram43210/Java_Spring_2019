import java.util.Random;
import java.util.stream.LongStream;

public class RandomDemo1
{

	public static void main(String[] args)
	{

		Random random = new Random();

		/*
		 * Returns an effectively unlimited stream of pseudorandom
		 * long values.
		 * 
		 */
		LongStream longStream = random.longs();

		longStream.forEach(System.out::println);

	}

}
