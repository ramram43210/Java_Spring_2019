import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		float[] floatArray1 = new float[] { 5.5f, 10.1f, 15.4f, 6.1f, 4.5f };
		System.out.println("floatArray1 = " + Arrays.toString(floatArray1));

		float[] floatArray2 = Arrays.copyOfRange(floatArray1, 0, 3);
		System.out.println("floatArray2 = " + Arrays.toString(floatArray2));

	}

}
