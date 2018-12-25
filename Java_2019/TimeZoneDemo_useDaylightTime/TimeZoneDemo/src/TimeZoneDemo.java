import java.util.TimeZone;

public class TimeZoneDemo
{
	public static void main(String[] args)
	{
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		System.out.println(timeZone);

		/*
		 * Returns:
		 * 
		 * true if this TimeZone uses Daylight Saving Time, false,
		 * otherwise.
		 */
		boolean result = timeZone.useDaylightTime();
		System.out.println(result);
	}
}
