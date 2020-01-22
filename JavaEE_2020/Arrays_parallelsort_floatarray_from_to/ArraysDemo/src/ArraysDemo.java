import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		float[] floatArray = { 8.1f, 9.2f, 4.4f, 3.5f, 5.2f, 1.3f };
		Arrays.parallelSort(floatArray, 0, 4);
		System.out.println(Arrays.toString(floatArray));
	}

}
