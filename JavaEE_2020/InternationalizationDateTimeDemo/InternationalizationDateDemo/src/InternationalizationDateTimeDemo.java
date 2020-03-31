import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Internationalizing DateTime (I18N with DateTime)
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
		 * Gets the date/time formatter with the given formatting styles for the given
		 * locale.
		 */
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT,
				DateFormat.DEFAULT, locale);
		Date date = new Date();
		String dateTimeStr = dateFormat.format(date);
		System.out.println("Time value in " + locale + " locale = " + dateTimeStr);
	}

}
