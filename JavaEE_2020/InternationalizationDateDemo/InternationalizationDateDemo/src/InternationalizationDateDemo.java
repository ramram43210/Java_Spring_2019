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
		 * Gets the date formatter with the given formatting style for the given locale.
		 */
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		Date currentDate = new Date();
		String date = dateFormat.format(currentDate);
		System.out.println("Date value in " + locale + " locale = " + date);
	}

}
