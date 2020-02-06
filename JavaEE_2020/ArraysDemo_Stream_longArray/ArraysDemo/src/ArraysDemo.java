import java.util.Arrays;
import java.util.stream.LongStream;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		long[] longArray = new long[] { 5, 15, 25, 35, 45 };
		LongStream longStream = Arrays.stream(longArray);
		longStream.forEach(System.out::println);
	}

}
