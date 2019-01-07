import java.text.DateFormat;
import java.text.NumberFormat;

public class DateFormatDemo
{
	public static void main(String[] args)
	{

		DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.LONG);

		/*
		 * Returns:
		 * 
		 * the number formatter which this date/time formatter uses.
		 */
		NumberFormat numberFormat = dateFormat.getNumberFormat();
		System.out.println(numberFormat);

	}

}
