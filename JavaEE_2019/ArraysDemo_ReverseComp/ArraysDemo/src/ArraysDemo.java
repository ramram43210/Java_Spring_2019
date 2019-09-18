import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		Integer[] integerArray = new Integer[] { 3, 1, 4, 2 };
		System.out.println("Before Sort= " + Arrays.toString(integerArray));

		Comparator<Integer> reverseComparator = Collections.reverseOrder();

		Arrays.sort(integerArray, reverseComparator);
		System.out.println("After Sort = " + Arrays.toString(integerArray));
	}

}
