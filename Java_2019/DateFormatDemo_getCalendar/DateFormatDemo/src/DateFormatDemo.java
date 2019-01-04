import java.text.DateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DateFormatDemo
{
	public static void main(String[] args)
	{

		DateFormat dateFormat = DateFormat.getDateTimeInstance();
		/*
		 * Returns:
		 * 
		 * the calendar associated with this date/time formatter.
		 */
		Calendar cal = dateFormat.getCalendar();
		System.out.println(cal.getTime());
		
		/*
		 * Returns:the time zone associated with the calendar of
		 * DateFormat.
		 */
		TimeZone timeZone = dateFormat.getTimeZone();
		System.out.println(timeZone);
		System.out.println(timeZone.getDisplayName());

	}

}
