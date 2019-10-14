import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		short[] shortArray = { 10, 5, 8, 90, 50 };

		Arrays.sort(shortArray, 0, 4);

		System.out.println("After Sort = " + Arrays.toString(shortArray));

		short key = 8;
		int indexOfKey = Arrays.binarySearch(shortArray, 0, 4, key);

		System.out.println("indexOfKey " + key + " is =  " + indexOfKey);
	}

}
