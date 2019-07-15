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
		 * Returns: An enum set containing all the elements in the
		 * specified type.
		 */
		EnumSet<Month> enumSet = EnumSet.allOf(Month.class);
		System.out.println("enumSet = " + enumSet);
	}

}
