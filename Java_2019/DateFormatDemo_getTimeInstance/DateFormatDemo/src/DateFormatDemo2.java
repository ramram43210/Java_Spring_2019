import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo2
{
	public static void main(String[] args)
	{
		Date date = new Date();
		System.out.println(date);
		/*
		 * Parameters:
		 * 
		 * style - the given formatting style. For example, SHORT for
		 * "h:mm a" in the US locale.
		 * 
		 * Returns:
		 * 
		 * a time formatter.
		 */
		DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.LONG);

		String formatedDateStr = dateFormat.format(date);
		System.out.println("formatedDateStr Long   = "+formatedDateStr);
		
		dateFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM);

		formatedDateStr = dateFormat.format(date);
		System.out.println("formatedDateStr MEDIUM = "+formatedDateStr);
		
		dateFormat = DateFormat.getTimeInstance(DateFormat.SHORT);

		formatedDateStr = dateFormat.format(date);
		System.out.println("formatedDateStr SHORT  = "+formatedDateStr);

	}
}
