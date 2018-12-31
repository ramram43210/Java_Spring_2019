import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo2
{
	public static void main(String[] args)
	{
		Date date = new Date();
		/*
		 * Parameters:
		 * 
		 * style - the given formatting style. For example, SHORT for
		 * "M/d/yy" in the US locale.
		 * 
		 * Returns:
		 * 
		 * a date formatter.
		 */
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT);
		String strDate = dateFormat.format(date);
		System.out.println("DEFAULT format = "+strDate);

		dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		strDate = dateFormat.format(date);
		System.out.println("FULL format = "+strDate);

		dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		strDate = dateFormat.format(date);
		System.out.println("LONG format = "+strDate);

		dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		strDate = dateFormat.format(date);
		System.out.println("SHORT format = "+strDate);

	}
}
