import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		char[] charArray = { 'c', 'b', 'e', 'd', 'f', 'a' };
		Arrays.parallelSort(charArray);
		System.out.println(Arrays.toString(charArray));
	}

}
