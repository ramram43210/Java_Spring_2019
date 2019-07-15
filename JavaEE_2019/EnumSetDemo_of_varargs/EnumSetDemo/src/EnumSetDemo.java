import java.util.EnumSet;

public class EnumSetDemo
{

	public enum Month
	{
		JAN, FEB, MAR, APR, MAY
	};

	public static void main(String[] args)
	{
		// create a fake array that will be used like args
		Month[] monthEnumArray = { Month.FEB, Month.MAR, Month.APR, Month.MAY };
		createEnumSet(monthEnumArray);
	}

	public static void createEnumSet(Month[] varargs)
	{
		/*
		 * Returns: an enum set initially containing the specified elements
		 */
		EnumSet<Month> enumSet = EnumSet.of(Month.JAN, varargs);
		System.out.println("enumSet = " + enumSet);
	}
}
