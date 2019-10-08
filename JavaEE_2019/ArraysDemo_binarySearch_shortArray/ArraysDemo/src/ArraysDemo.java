import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		short[] shortArray = { 10, 5, 8, 90, 50 };

		Arrays.sort(shortArray);

		System.out.println("After Sort = " + Arrays.toString(shortArray));

		short key = 8;
		int indexOfKey = Arrays.binarySearch(shortArray, key);

		System.out.println("indexOfKey " + key + " is =  " + indexOfKey);
	}

}
