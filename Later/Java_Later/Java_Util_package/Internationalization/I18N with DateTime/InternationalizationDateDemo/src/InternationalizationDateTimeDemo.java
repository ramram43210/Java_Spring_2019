import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 
 * Internationalizing DateTime (I18N with DateTime)
 *
 */
public class InternationalizationDateTimeDemo
{

	public static void main(String[] args)
	{
		displayDateTime(Locale.US);
		displayDateTime(Locale.CHINA);
		displayDateTime(Locale.FRANCE);
	}

	public static void displayDateTime(Locale locale)
	{
		/*
		 * Gets the date/time formatter with the given formatting
		 * styles for the given locale.
		 * 
		 * Parameters:
		 * 
		 * dateStyle - the given date formatting style.
		 * 
		 * timeStyle - the given time formatting style.
		 * 
		 * aLocale - the given locale. Returns: a date/time formatter.
		 */
		DateFormat formatter = DateFormat.getDateTimeInstance(
				DateFormat.DEFAULT, DateFormat.DEFAULT, locale);
		Date date = new Date();

		/*
		 * Formats a Date into a date/time string.
		 * 
		 */
		String strDate = formatter.format(date);
		System.out.println("Time value in " + locale + " locale = " + strDate);
	}

}
