import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		byte[] byteArray = { 8, 9, 4, 3, 5, 1 };
		Arrays.parallelSort(byteArray);
		System.out.println(Arrays.toString(byteArray));
	}

}
