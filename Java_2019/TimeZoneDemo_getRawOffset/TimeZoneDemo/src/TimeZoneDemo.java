import java.util.TimeZone;

public class TimeZoneDemo
{
	public static void main(String[] args)
	{
		TimeZone timezone = TimeZone.getDefault();

		/*
		 * Returns the amount of time in milliseconds to add to UTC to
		 * get standard time in this time zone. Because this value is
		 * not affected by daylight saving time, it is called raw
		 * offset.
		 */
		int rawOffset = timezone.getRawOffset();
		System.out.println("rawOffset = " + rawOffset);
	}
}
