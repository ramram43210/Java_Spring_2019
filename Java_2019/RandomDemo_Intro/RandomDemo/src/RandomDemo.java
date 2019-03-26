import java.util.Random;

public class RandomDemo
{

	public static void main(String[] args)
	{
		/*
		 * Creates a new random number generator.
		 */
		Random random = new Random();

		int i = 0;
		while (i < 5)
		{
			/*
			 * Returns:
			 * 
			 * the next pseudorandom, uniformly distributed int value
			 * from this random number generator's sequence
			 */
			int randomNumber = random.nextInt();
			System.out.println("randomNumber =  " + randomNumber);
			++i;
		}

	}

}
