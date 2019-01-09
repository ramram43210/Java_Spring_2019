import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo
{
	public static void main(String[] args)
	{
		Date date =  new Date();
		System.out.println("date           = "+date);
		
		SimpleDateFormat formatter = new SimpleDateFormat();

		/*
		 * Parameters:
		 *
		 * pattern - the new date and time pattern for this date
		 * format
		 */
		formatter.applyPattern("MMM");
		String strDate = formatter.format(date);
		System.out.println("Formatted date = "+strDate);
	}

}
