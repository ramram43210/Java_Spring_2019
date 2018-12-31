import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo
{
	public static void main(String[] args)
	{
		Date date = new Date();
		System.out.println("date = "+date);

		/*
		 * Parameters:
		 * 
		 * dateStyle - the given date formatting style. For example,
		 * SHORT for "M/d/yy" in the US locale.
		 * 
		 * timeStyle - the given time formatting style. For example,
		 * SHORT for "h:mm a" in the US locale.
		 * 
		 * Returns:
		 * 
		 * a date/time formatter.
		 */
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,
				DateFormat.SHORT);
		String strDate = dateFormat.format(date);
		System.out.println("SHORT format = " + strDate);

		dateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,
				DateFormat.MEDIUM);
		strDate = dateFormat.format(date);
		System.out.println("MEDIUM format = " + strDate);

		dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG);
		strDate = dateFormat.format(date);
		System.out.println("LONG format = " + strDate);
	}
}
