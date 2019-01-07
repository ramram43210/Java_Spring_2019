import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatDemo
{
	public static void main(String[] args)
	{

		DateFormat dateFormat = DateFormat.getDateTimeInstance();
		try
		{
			/*
			 * Parameters:
			 * 
			 * source - A String whose beginning should be parsed.
			 * 
			 * Returns:
			 * 
			 * A Date parsed from the string.
			 */
			Date date = dateFormat.parse("Jan 9, 2018 3:27:52 PM");
			System.out.println(date);
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}

	}

}
