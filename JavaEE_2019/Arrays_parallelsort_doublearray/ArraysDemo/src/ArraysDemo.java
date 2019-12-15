import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		double[] doubleArray = { 8.1, 9.2, 4.4, 3.5, 5.2, 1.3 };
		Arrays.parallelSort(doubleArray);
		System.out.println(Arrays.toString(doubleArray));
	}

}
