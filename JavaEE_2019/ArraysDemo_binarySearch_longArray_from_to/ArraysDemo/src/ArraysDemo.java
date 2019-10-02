import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		long[] longArray = { 10, 5, 8, 90, 50 };

		Arrays.sort(longArray, 0, 4);

		System.out.println("After Sort = " + Arrays.toString(longArray));

		int key = 10;
		int indexOfKey = Arrays.binarySearch(longArray, 0, 4, key);

		System.out.println("indexOfKey " + key + " is =  " + indexOfKey);
	}

}
