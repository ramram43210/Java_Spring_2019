import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		double[] doubleArray1 = new double[] { 3.2, 5.5, 2.4, 5.5 };

		System.out.println("doubleArray1 = " + Arrays.toString(doubleArray1));

		double[] doubleArray2 = Arrays.copyOf(doubleArray1, 3);

		System.out.println("doubleArray2 = " + Arrays.toString(doubleArray2));

	}

}
