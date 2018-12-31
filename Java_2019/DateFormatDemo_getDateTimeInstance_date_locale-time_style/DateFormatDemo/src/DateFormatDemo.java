import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo
{
	public static void main(String[] args)
	{
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		/*
		 * Parameters:
		 * 
		 * dateStyle - the given date formatting style.
		 * timeStyle - the given time formatting style.
		 * aLocale - the given locale.
		 * 
		 * Returns:
		 * 
		 * a date/time formatter.
		 */
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String strDate = dateFormat.format(new Date());
		System.out.println(strDate);
	}
}
