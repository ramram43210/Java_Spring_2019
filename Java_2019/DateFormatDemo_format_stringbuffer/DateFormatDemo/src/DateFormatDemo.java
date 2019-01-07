import java.text.DateFormat;
import java.text.FieldPosition;
import java.util.Date;

public class DateFormatDemo
{
	public static void main(String[] args)
	{
		Date date = new Date();
		System.out.println(date);

		DateFormat dateFormat = DateFormat.getDateInstance();
		StringBuffer sb = new StringBuffer();

		/*
		 * Parameters:
		 *
		 * date - a Date to be formatted into a date/time string.
		 *
		 * toAppendTo - the string buffer for the returning date/time
		 * string.
		 *
		 * fieldPosition - keeps track of the position of the field
		 * within the returned string.
		 *
		 * Returns:
		 *
		 * the string buffer passed in as toAppendTo, with formatted
		 * text appended.
		 */
		sb = dateFormat.format(date, sb,
				new FieldPosition(DateFormat.DAY_OF_WEEK_IN_MONTH_FIELD));
		System.out.println(sb);

	}

}
