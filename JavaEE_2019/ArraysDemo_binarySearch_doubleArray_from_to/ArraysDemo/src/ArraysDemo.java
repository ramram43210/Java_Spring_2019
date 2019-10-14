import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		double[] doubleArray = { 10.1, 5.9, 8.6, 90.4, 50.2 };

		Arrays.sort(doubleArray, 0, 4);

		System.out.println("After Sort = " + Arrays.toString(doubleArray));

		double key = 8.6;
		int indexOfKey = Arrays.binarySearch(doubleArray, 0, 4, key);

		System.out.println("indexOfKey " + key + " is =  " + indexOfKey);
	}

}
