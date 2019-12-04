import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		int[] intArray = { 8, 9, 4, 3, 5, 1 };
		Arrays.parallelSort(intArray);
		System.out.println(Arrays.toString(intArray));
	}

}
