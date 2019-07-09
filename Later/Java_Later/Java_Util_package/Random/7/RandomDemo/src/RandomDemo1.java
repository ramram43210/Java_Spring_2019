import java.util.Random;
import java.util.stream.IntStream;

public class RandomDemo1
{

	public static void main(String[] args)
	{
		Random random = new Random();

		/*
		 * Returns an effectively unlimited stream of pseudorandom int
		 * values.
		 */
		IntStream intStream = random.ints();

		intStream.forEach(System.out::println);

	}

}
