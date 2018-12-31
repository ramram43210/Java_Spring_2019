import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo1
{
	public static void main(String[] args)
	{
		Date currentDate = new Date();
		System.out.println("Current Date = " + currentDate);

		/*
		 * Returns:
		 * 
		 * a date formatter.
		 */
		DateFormat dateFormat = DateFormat.getDateInstance();

		/*
		 * Parameters:
		 * 
		 * date - the time value to be formatted into a time string.
		 * 
		 * Returns:
		 * 
		 * the formatted date/time string.
		 */
		String dateToStr = dateFormat.format(currentDate);
		System.out.println("Formatted Date = " + dateToStr);
	}
}
