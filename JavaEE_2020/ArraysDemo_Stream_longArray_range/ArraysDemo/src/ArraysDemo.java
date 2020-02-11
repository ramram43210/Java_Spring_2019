import java.util.Arrays;
import java.util.stream.LongStream;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		long[] longArray = new long[] { 5, 15, 25, 35, 45 };
		LongStream longStream = Arrays.stream(longArray, 1, 3);
		longStream.forEach(System.out::println);
	}

}
