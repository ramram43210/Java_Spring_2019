import java.util.TimeZone;

public class TimeZoneDemo
{
	public static void main(String[] args)
	{

		TimeZone tzone = TimeZone.getDefault();

		System.out.println(
				"Before Set, Offset value is = " + tzone.getRawOffset());

		/*
		 * Parameters:
		 * 
		 * offsetMillis - the given base time zone offset to GMT.
		 */
		tzone.setRawOffset(20000);

		System.out.println(
				"After Set, Offset value is  = " + tzone.getRawOffset());
	}
}
