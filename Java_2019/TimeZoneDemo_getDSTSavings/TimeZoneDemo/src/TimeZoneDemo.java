import java.util.TimeZone;

public class TimeZoneDemo
{
	public static void main(String[] args)
	{
		TimeZone timezone = TimeZone.getTimeZone("Europe/Paris");
		
		
		/*
		 * Returns:the ID of this time zone.
		 */
		System.out.println("ID value is = " + timezone.getID());

		/*
		 * Returns:
		 * 
		 * the amount of saving time in milliseconds
		 */
		System.out.println("DST saving is = " + timezone.getDSTSavings());
	}
}
