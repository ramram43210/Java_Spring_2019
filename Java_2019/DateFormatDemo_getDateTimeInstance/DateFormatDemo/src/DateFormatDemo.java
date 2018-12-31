import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo
{
	public static void main(String[] args)
	{
		Date currentDate = new Date();
		System.out.println("Current Date = " + currentDate);

		/*
		 * Returns:
		 * 
		 * a date/time formatter with the default formatting style for
		 * the default FORMAT locale.
		 */
		DateFormat dateFormat = DateFormat.getDateTimeInstance();

		/*
		 * Parameters:
		 * 
		 * date - the time value to be formatted into a date/time
		 * string.
		 * 
		 * Returns:
		 * 
		 * the formatted date/time string.
		 */
		String dateToStr = dateFormat.format(currentDate);
		System.out.println("Formatted Date = " + dateToStr);
	}
}
