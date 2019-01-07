import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo3
{
	public static void main(String[] args)
	{

		Locale locale = Locale.getDefault();
		System.out.println(locale);
		/*
		 * Parameters:
		 * 
		 * style - the given formatting style. For example, SHORT for
		 * "M/d/yy" in the US locale. aLocale - the given locale.
		 * 
		 * aLocale the given locale.
		 * 
		 * Returns:
		 * 
		 * a date formatter.
		 */
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG,
				locale);

		String strDate = dateFormat.format(new Date());
		System.out.println(strDate);

	}
}
