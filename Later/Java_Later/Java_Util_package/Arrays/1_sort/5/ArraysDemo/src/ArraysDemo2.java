import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		float[] floatArray = { 5.2f, 2.3f, 7.6f, 3.4f, 9.8f };

		/*
		 * Sorts the specified range of the array into ascending
		 * order. The range to be sorted extends from the index
		 * fromIndex, inclusive, to the index toIndex, exclusive. If
		 * fromIndex == toIndex, the range to be sorted is empty.
		 *
		 * Parameters:
		 *
		 * a - the array to be sorted
		 *
		 * fromIndex - the index of the first element, inclusive, to
		 * be sorted
		 *
		 * toIndex - the index of the last element, exclusive, to be
		 * sorted
		 *
		 */
		Arrays.sort(floatArray, 2, 5);

		System.out.println("The sorted float array is:");
		int i = 0;
		for (float number : floatArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}
	}

}
