import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo3
{
	public static void main(String[] args)
	{
		Date date = new Date();
		System.out.println(date);

		Locale locale = Locale.CANADA;
		System.out.println(locale);

		/*
		 * Parameters:
		 * 
		 * style - the given formatting style. For example, SHORT for
		 * "h:mm a" in the US locale. 
		 * 
		 * aLocale - the given locale.
		 * 
		 * Returns:
		 * 
		 * a time formatter.
		 */
		DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.LONG,
				locale);

		String formatedDateStr = dateFormat.format(date);
		System.out.println(formatedDateStr);

	}
}
