import java.util.Arrays;
import java.util.stream.DoubleStream;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		double[] doubleArray = new double[] { 5.6, 15.5, 25.1, 35.3, 45.5 };
		DoubleStream doubleStream = Arrays.stream(doubleArray);
		doubleStream.forEach(System.out::println);
	}

}
