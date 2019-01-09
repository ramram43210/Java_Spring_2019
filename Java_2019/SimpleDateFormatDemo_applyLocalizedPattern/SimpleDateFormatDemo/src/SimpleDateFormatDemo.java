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
		 * pattern - a String to be mapped to the new date and time
		 * format pattern for this format
		 */
		formatter.applyLocalizedPattern("dd-MMM-yyyy");
		String strDate = formatter.format(date);
		System.out.println("Formatted date = "+strDate);
	}

}
