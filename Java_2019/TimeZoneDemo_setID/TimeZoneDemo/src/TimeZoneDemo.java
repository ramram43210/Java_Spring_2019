import java.util.TimeZone;

public class TimeZoneDemo
{
	public static void main(String[] args)
	{
		TimeZone tzone = TimeZone.getDefault();
		System.out.println("Before Set, Time zone ID = " + tzone.getID());

		/*
		 * Parameters:
		 * 
		 * ID - the new time zone ID.
		 */
		tzone.setID("GMT+10:00");

		System.out.println("After Set, Time zone ID  = " + tzone.getID());
	}
}
