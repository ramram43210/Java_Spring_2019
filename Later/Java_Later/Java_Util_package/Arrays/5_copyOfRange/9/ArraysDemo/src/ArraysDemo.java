import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		Integer[] integerArray1 = new Integer[] { 5, 10, 15 };

		System.out.println("printing IntegerArray1:");
		prIntegerArrayDetails(IntegerArray1);

		/*
		 * public static <T> T[] copyOfRange(T[] original, int from,
		 * 														int to)
		 *
		 * Type Parameters:
		 *
		 * T - the class of the objects in the array
		 *
		 * Parameters:
		 *
		 * original - the array from which a range is to be copied
		 *
		 * from - the initial index of the range to be copied,
		 * inclusive
		 *
		 * to - the final index of the range to be copied, exclusive.
		 * (This index may lie outside the array.)
		 *
		 * Returns:
		 *
		 * a new array containing the specified range from the
		 * original array, truncated or padded with nulls to obtain
		 * the required length
		 */

		Integer[] integerArray2 = Arrays.copyOfRange(IntegerArray1, 1, 5);

		System.out.println("\nprinting IntegerArray2:");
		prIntegerArrayDetails(IntegerArray2);

	}

	private static void prIntegerArrayDetails(Integer[] integerArray)
	{
		Integer i = 0;
		for (Integer IntegerValue : IntegerArray)
		{
			System.out.println("IntegerArray[" + i + "] = " + IntegerValue);
			++i;
		}
	}

}
