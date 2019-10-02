import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		char[] charArray = { 'a', 'c', 'g', 'z', 'd' };

		Arrays.sort(charArray, 0, 4);

		System.out.println("After Sort = " + Arrays.toString(charArray));

		char key = 'c';
		int indexOfKey = Arrays.binarySearch(charArray, 0, 4, key);

		System.out.println("indexOfKey " + key + " is =  " + indexOfKey);
	}

}
