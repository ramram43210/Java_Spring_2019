import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo
{
	public static void main(String[] args)
	{

		Date date = new Date();
		System.out.println(date);
		/*
		 * Parameters:
		 *
		 * pattern - the pattern describing the date and time format
		 */
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		/*
		 * Parameters:
		 *
		 * date - the time value to be formatted into a time string.
		 *
		 * Returns:
		 *
		 * the formatted time string.
		 */
		String strDate = formatter.format(date);
		System.out.println(strDate);
	}

}
