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
		 * Returns: an enum set initially containing the specified elements
		 */

		EnumSet<Month> enumSet = EnumSet.of(Month.MAR, Month.JAN, Month.MAY, Month.FEB, Month.APR);
		System.out.println("enumSet = " + enumSet);
	}

}
