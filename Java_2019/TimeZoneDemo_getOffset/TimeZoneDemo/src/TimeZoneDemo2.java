import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneDemo2
{
	public static void main(String[] args)
	{
		TimeZone timezone = TimeZone.getTimeZone("Europe/Paris");

		/*
		 * Parameters:
		 * 
		 * date - the date represented in milliseconds since January
		 * 1, 1970 00:00:00 GMT
		 * 
		 * Returns:
		 * 
		 * the amount of time in milliseconds to add to UTC to get
		 * local time.
		 */
		int offset = timezone.getOffset(Calendar.ZONE_OFFSET);
		System.out.println("offset = " + offset);
	}
}
