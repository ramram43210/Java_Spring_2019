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
		 * Returns: an enum set initially containing all of the elements in the range defined by the
		 * two specified endpoints
		 */
		EnumSet<Month> enumSet = EnumSet.range(Month.JAN, Month.APR);
		System.out.println("enumSet = " + enumSet);
	}

}
