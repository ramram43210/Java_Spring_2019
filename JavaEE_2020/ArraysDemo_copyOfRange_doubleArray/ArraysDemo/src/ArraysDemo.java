import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		double[] doubleArray1 = new double[] { 5.5, 10.1, 15.4, 6.1, 4.5 };
		System.out.println("doubleArray1 = " + Arrays.toString(doubleArray1));

		double[] doubleArray2 = Arrays.copyOfRange(doubleArray1, 0, 3);
		System.out.println("doubleArray2 = " + Arrays.toString(doubleArray2));

	}

}
