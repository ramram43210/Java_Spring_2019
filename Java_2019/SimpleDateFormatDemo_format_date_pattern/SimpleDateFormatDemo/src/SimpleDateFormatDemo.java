import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo
{
	public static void main(String[] args)
	{

		Date date = new Date();
		System.out.println("date = "+date);

		/*
		 * Parameters: pattern the pattern describing the date and
		 * time format
		 */
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String strDate = formatter.format(date);
		System.out.println("Date Format with MM/dd/yyyy = " + strDate);

		formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		strDate = formatter.format(date);
		System.out.println("Date Format with dd-MM-yyyy hh:mm:ss = " + strDate);

		formatter = new SimpleDateFormat("dd MMMM yyyy");
		strDate = formatter.format(date);
		System.out.println("Date Format with dd MMMM yyyy = " + strDate);

		formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
		strDate = formatter.format(date);
		System.out.println("Date Format with dd MMMM yyyy zzzz = " + strDate);

		formatter = new SimpleDateFormat("E, dd MMM yyyy hh:mm:ss z");
		strDate = formatter.format(date);
		System.out.println(
				"Date Format with E, dd MMM yyyy hh:mm:ss z : " + strDate);
	}

}
