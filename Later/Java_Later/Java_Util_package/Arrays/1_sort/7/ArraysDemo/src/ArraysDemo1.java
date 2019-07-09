import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		Object[] objectArray = { 5, 2, 7, 3, 9 };

		/*
		 * Sorts the specified array into ascending numerical order.
		 * 
		 * Parameters:
		 * 
		 * a - the array to be sorted
		 * 
		 */
		Arrays.sort(objectArray);

		System.out.println("The sorted Object array is:");
		int i = 0;
		for (Object number : objectArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}

	}

}
