import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		int[] intArray = { 10, 5, 8, 90, 50 };

		Arrays.sort(intArray, 0, 4);

		System.out.println("After Sort = " + Arrays.toString(intArray));

		int key = 10;
		int indexOfKey = Arrays.binarySearch(intArray, 0, 4, key);

		System.out.println("indexOfKey " + key + " is =  " + indexOfKey);
	}

}
