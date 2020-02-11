import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		int[] intArray = new int[] { 5, 15, 25, 35, 45 };
		IntStream intStream = Arrays.stream(intArray, 1, 3);
		intStream.forEach(System.out::println);
	}

}
