import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		float[] floatArray1 = new float[] { 3.2f, 5.5f, 2.4f, 5.5f };

		System.out.println("floatArray1 = " + Arrays.toString(floatArray1));

		float[] floatArray2 = Arrays.copyOf(floatArray1, 3);

		System.out.println("floatArray2 = " + Arrays.toString(floatArray2));

	}

}
