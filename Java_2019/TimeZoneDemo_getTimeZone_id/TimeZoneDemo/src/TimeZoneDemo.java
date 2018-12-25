import java.util.TimeZone;

public class TimeZoneDemo
{
	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * ID - the ID for a TimeZone, either an abbreviation such as
		 * "PST", a full name such as "America/Los_Angeles", or a
		 * custom ID such as "GMT-8:00". Note that the support of
		 * abbreviations is for JDK 1.1.x compatibility only and full
		 * names should be used.
		 * 
		 * Returns:the specified TimeZone, or the GMT zone if the
		 * given ID cannot be understood.
		 */
		TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
		System.out.println(timeZone);
		System.out.println(timeZone.getDisplayName());
	}
}
