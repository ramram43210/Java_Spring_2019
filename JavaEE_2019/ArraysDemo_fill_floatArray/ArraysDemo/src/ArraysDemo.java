import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		float[] floatArray = new float[] { 2.1f, 7.2f, 9.4f, 1.4f };

		System.out.println("Before fill = " + Arrays.toString(floatArray));

		Arrays.fill(floatArray, 8.2f);

		System.out.println("After fill  = " + Arrays.toString(floatArray));
	}

}
