import java.util.Random;

public class RandomDemo1
{

	public static void main(String[] args)
	{
		Random random = new Random();

		int i = 0;
		while (i < 5)
		{
			/*
			 * Returns:
			 * 
			 * the next pseudorandom, uniformly distributed long value
			 * from this random number generator's sequence
			 */
			long longValue = random.nextLong();
			System.out.println("longValue =  " + longValue);
			++i;
		}

	}

}
