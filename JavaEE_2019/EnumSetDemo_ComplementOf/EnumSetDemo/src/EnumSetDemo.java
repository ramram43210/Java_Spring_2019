import java.util.EnumSet;

public class EnumSetDemo
{

	public enum Month
	{
		JAN, FEB, MAR, APR, MAY
	};

	public static void main(String[] args)
	{
		EnumSet<Month> enumSet1 = EnumSet.of(Month.JAN);
		System.out.println("enumSet1 = " + enumSet1);

		/*
		 * Create a enumSet2 which has all elements that enumSet1
		 * doesn't have
		 */
		EnumSet<Month> enumSet2 = EnumSet.complementOf(enumSet1);
		System.out.println("enumSet2 = " + enumSet2);
	}

}
