import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		short[] shortArray1 = new short[] { 5, 10, 15, 20, 25 };
		System.out.println("shortArray1 = " + Arrays.toString(shortArray1));

		short[] shortArray2 = Arrays.copyOfRange(shortArray1, 0, 3);
		System.out.println("shortArray2 = " + Arrays.toString(shortArray2));

	}

}
