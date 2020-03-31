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
		 * Gets the time formatter with the given formatting style for the given locale.
		 */
		DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
		Date date = new Date();
		String strDate = dateFormat.format(date);
		System.out.println("Time value in " + locale + " locale = " + strDate);
	}

}
