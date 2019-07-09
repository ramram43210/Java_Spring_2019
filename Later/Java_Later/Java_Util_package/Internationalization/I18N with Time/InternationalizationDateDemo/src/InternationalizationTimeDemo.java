import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 
 * Internationalizing Time (I18N with Time)
 *
 */
public class InternationalizationTimeDemo
{

	public static void main(String[] args)
	{
		displayTime(Locale.US);
		displayTime(Locale.CHINA);
		displayTime(Locale.FRANCE);
	}

	public static void displayTime(Locale locale)
	{
		/*
		 * Gets the time formatter with the given formatting style for
		 * the given locale.
		 * 
		 * Parameters:
		 * 
		 * style - the given formatting style. For example, SHORT for
		 * "h:mm a" in the US locale.
		 * 
		 * aLocale - the given locale. Returns: a time formatter.
		 */
		DateFormat formatter = DateFormat.getTimeInstance(DateFormat.DEFAULT,
				locale);
		Date date = new Date();

		/*
		 * Formats a Date into a date/time string.
		 * 
		 */
		String strDate = formatter.format(date);
		System.out.println("Time value in " + locale + " locale = " + strDate);
	}

}
