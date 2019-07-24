import java.util.EnumSet;

public class EnumSetDemo
{

	public enum Month
	{
		JAN, FEB, MAR, APR, MAY
	};

	public static void main(String[] args)
	{
		/*
		 * Returns: An empty enum set of the specified type.
		 */
		EnumSet<Month> enumSet = EnumSet.noneOf(Month.class);
		System.out.println("enumSet = " + enumSet);
	}

}
