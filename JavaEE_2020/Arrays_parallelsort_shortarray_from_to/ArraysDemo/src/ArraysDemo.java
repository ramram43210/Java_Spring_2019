import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		short[] shortArray = { 8, 9, 4, 3, 5, 1 };
		Arrays.parallelSort(shortArray, 0, 4);
		System.out.println(Arrays.toString(shortArray));
	}

}
