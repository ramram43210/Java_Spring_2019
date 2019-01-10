import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo
{
	public static void main(String[] args)
	{
		Date date =  new Date();
		System.out.println("date = "+date);
				
		SimpleDateFormat formatter = new SimpleDateFormat();
		
		/*
	     * Returns:a localized pattern string describing this date format.
	     */
	    String strPattern = formatter.toLocalizedPattern();
	    System.out.println("Pattern =  "+strPattern);
		
	    String strDate = formatter.format(date);
	    System.out.println("Formatted Date = " + strDate);
	}

}
