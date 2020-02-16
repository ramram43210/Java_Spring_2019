import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		double[] doubleArray = new double[5];
		System.out.println("before SetAll = "+Arrays.toString(doubleArray));
	
		Arrays.setAll(doubleArray, (index) -> index + 2);
		System.out.println("After SetAll  = "+Arrays.toString(doubleArray));
	}

}
