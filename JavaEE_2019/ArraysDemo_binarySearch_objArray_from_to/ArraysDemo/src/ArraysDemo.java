import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		Object[] objArray = { new Integer(10), new Integer(8), new Integer(5),
				new Integer(90), new Integer(50) };

		Arrays.sort(objArray, 0, 4);

		System.out.println("After Sort = " + Arrays.toString(objArray));

		Integer key = new Integer(8);
		int indexOfKey = Arrays.binarySearch(objArray, 0, 4, key);

		System.out.println("indexOfKey " + key + " is =  " + indexOfKey);
	}

}
