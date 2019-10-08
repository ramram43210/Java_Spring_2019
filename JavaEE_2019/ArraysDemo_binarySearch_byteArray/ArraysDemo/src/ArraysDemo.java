import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		byte[] byteArray = { 10, 5, 8, 90, 50 };

		Arrays.sort(byteArray);

		System.out.println("After Sort = " + Arrays.toString(byteArray));

		byte key = 8;
		int indexOfKey = Arrays.binarySearch(byteArray, key);

		System.out.println("indexOfKey " + key + " is =  " + indexOfKey);
	}

}
