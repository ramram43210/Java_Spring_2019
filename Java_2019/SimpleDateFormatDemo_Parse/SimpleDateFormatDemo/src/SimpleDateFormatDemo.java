import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo
{
	public static void main(String[] args)
	{
		try
		{
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

			/*
			 * Parameters:
			 *
			 * source - A String whose beginning should be parsed.
			 *
			 * Returns:
			 *
			 * A Date parsed from the string.
			 */
			Date date = formatter.parse("31/03/2015");
			System.out.println("date = " + date);
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}

	}

}
