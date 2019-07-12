import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		Integer[] integerArray = new Integer[] { 5, 15, 25, 35, 45 };

		copy
		 * Parameters:
		 *
		 * array - the array, assumed to be unmodified during use
		 *
		 * Returns:
		 *
		 * an IntegerStream for the array
		 */
		Stream<Integer> stream = Arrays.stream(integerArray);
		stream.forEach(System.out::println);
	}

}
