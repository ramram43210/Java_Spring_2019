import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		double[] doubleArray = new double[] { 2.1, 7.2, 9.4, 1.4 };

		System.out.println("Before fill = " + Arrays.toString(doubleArray));

		Arrays.fill(doubleArray, 8.2);

		System.out.println("After fill  = " + Arrays.toString(doubleArray));
	}

}
