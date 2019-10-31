import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		short[] shortArray1 = new short[] { 3, 5, 2, 4 };

		System.out.println("shortArray1 = " + Arrays.toString(shortArray1));

		short[] shortArray2 = Arrays.copyOf(shortArray1, 3);

		System.out.println("shortArray2 = " + Arrays.toString(shortArray2));

	}

}
