import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		int[] intArray = { 10, 5, 8, 90, 50, 40 };

		Arrays.sort(intArray);

		System.out.println("After Sort = " + Arrays.toString(intArray));

		int key = 8;
		int indexOfKey = Arrays.binarySearch(intArray, key);

		System.out.println("indexOfKey " + key + " is =  " + indexOfKey);
	}

}
