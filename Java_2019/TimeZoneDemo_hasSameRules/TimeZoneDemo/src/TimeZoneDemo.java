import java.util.TimeZone;

public class TimeZoneDemo
{
	public static void main(String[] args)
	{
		TimeZone timeZone1 = TimeZone.getDefault();
		TimeZone timeZone2 = TimeZone.getTimeZone("America/Los_Angeles");
		TimeZone timeZone3 = TimeZone.getTimeZone("America/Los_Angeles");

		/*
		 * Parameters:
		 * 
		 * other - the TimeZone object to be compared with
		 * 
		 * Returns:
		 * 
		 * true if the other zone is not null and is the same as this
		 * one, with the possible exception of the ID
		 */
		boolean hasSameRules = timeZone1.hasSameRules(timeZone2);
		System.out.println(hasSameRules);
		
		hasSameRules = timeZone2.hasSameRules(timeZone3);
		System.out.println(hasSameRules);
	}
}
