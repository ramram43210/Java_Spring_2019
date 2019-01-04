import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo1
{
	public static void main(String[] args)
	{

		Date date = new Date();
		System.out.println(date);

		/*
		 * Returns:a time formatter.
		 */
		DateFormat dateFormat = DateFormat.getTimeInstance();

		String formatedDateStr = dateFormat.format(date);
		System.out.println(formatedDateStr);

	}

}
