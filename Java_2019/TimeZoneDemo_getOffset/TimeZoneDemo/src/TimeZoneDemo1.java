import java.util.TimeZone;

public class TimeZoneDemo1
{
	public static void main(String[] args)
	{
		TimeZone timezone = TimeZone.getTimeZone("Europe/Paris");

		/*
		 * Parameters:
		 * 
		 * era - the era of the given date.
		 * year - the year in the given date.
		 * month - the month in the given date. Month is 0-based. e.g., 0 for January.
		 * day - the day-in-month of the given date.
		 * dayOfWeek - the day-of-week of the given date.
		 * milliseconds - the milliseconds in day in standard local time.
		 * 
		 * Returns:
		 * 
		 * the offset in milliseconds to add to GMT to get local time.
		 */
		int offset = timezone.getOffset(1, 2017, 3, 4, 5, 300);
		System.out.println("offset = " + offset);
	}
}
