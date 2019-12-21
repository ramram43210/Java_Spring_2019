import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		long[] longArray = { 8, 9, 4, 3, 5, 1 };
		Arrays.parallelSort(longArray, 0, 4);
		System.out.println(Arrays.toString(longArray));
	}

}
