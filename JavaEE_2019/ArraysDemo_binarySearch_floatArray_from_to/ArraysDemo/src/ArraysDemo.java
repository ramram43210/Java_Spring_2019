import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		float[] floatArray = { 10.1f, 5.9f, 8.6f, 90.4f, 50.2f };

		Arrays.sort(floatArray, 0, 4);

		System.out.println("After Sort = " + Arrays.toString(floatArray));

		float key = 8.6f;
		int indexOfKey = Arrays.binarySearch(floatArray, 0, 4, key);

		System.out.println("indexOfKey " + key + " is =  " + indexOfKey);
	}

}
