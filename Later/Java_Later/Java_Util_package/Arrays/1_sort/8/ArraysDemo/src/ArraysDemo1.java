import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		 char[] charArray = {'d','b','e','a','c'};

		/*
		 * Sorts the specified array into ascending numerical order.
		 * 
		 * Parameters:
		 * 
		 * a - the array to be sorted
		 * 
		 */
		Arrays.sort(charArray);

		System.out.println("The sorted Object array is:");
		int i = 0;
		for (char ch : charArray)
		{
			System.out.println("Index = " + i + ", Number = " + ch);
			++i;
		}

	}

}
