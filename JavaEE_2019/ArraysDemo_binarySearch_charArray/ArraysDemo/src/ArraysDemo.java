import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		char[] charArray = { 'a', 'c', 'g', 'z', 'd' };

		Arrays.sort(charArray);

		System.out.println("After Sort = " + Arrays.toString(charArray));

		char key = 'c';
		int indexOfKey = Arrays.binarySearch(charArray, key);

		System.out.println("indexOfKey " + key + " is =  " + indexOfKey);
	}

}
