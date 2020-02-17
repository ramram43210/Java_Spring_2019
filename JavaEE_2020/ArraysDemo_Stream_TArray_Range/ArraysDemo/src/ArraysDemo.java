import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		Integer[] integerArray = new Integer[] { 5, 15, 25, 35, 45 };
		Stream<Integer> stream = Arrays.stream(integerArray,0,3);
		stream.forEach(System.out::println);
	}

}
