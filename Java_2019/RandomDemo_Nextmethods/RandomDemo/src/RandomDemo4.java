import java.util.Random;

public class RandomDemo4
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
			 * the next pseudorandom, uniformly distributed boolean
			 * value from this random number generator's sequence
			 */
			boolean booleanValue = random.nextBoolean();
			System.out.println("booleanValue =  " + booleanValue);
			++i;
		}

	}

}
