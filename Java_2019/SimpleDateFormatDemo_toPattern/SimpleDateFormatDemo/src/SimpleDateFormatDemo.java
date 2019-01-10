import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class SimpleDateFormatDemo
{
	public static void main(String[] args)
	{

		SimpleDateFormat df = (SimpleDateFormat) DateFormat.getDateInstance();

		/*
		 * Returns:a pattern string describing this date format.
		 */

		String strPattern = df.toPattern();
		System.out.println(strPattern);

		df = (SimpleDateFormat) DateFormat.getDateTimeInstance();

		strPattern = df.toPattern();
		System.out.println(strPattern);
	}

}
