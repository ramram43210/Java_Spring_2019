import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 
 * Internationalizing Date (I18N with Date).
 *
 */
public class InternationalizationDateDemo
{

	public static void main(String[] args)
	{
		displayDate(Locale.US);
		displayDate(Locale.FRANCE);
		displayDate(Locale.CHINA);
	}

	public static void displayDate(Locale locale)
	{
		/*
		 * Gets the date formatter with the given formatting style for
		 * the given locale.
		 * 
		 * Parameters:
		 * 
		 * style - the given formatting style. For example, SHORT for
		 * "M/d/yy" in the US locale.
		 * 
		 * aLocale - the given locale. Returns: a date formatter.
		 */
		DateFormat formatter = DateFormat.getDateInstance(DateFormat.DEFAULT,
				locale);
		Date currentDate = new Date();

		/*
		 * Formats a Date into a date/time string.
		 * 
		 */
		String date = formatter.format(currentDate);
		System.out.println("Date value in " + locale + " locale = " + date);
	}

}
