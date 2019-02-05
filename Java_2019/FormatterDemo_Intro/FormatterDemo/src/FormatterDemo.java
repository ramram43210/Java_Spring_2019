import java.util.Formatter;

/**
 * public Formatter format(String format, Object... args)
 * 
 * Parameters:
 * 
 * format - A format string as described in Format string syntax.
 * 
 * args - Arguments referenced by the format specifiers in the format
 * string. If there are more arguments than format specifiers, the
 * extra arguments are ignored. The maximum number of arguments is
 * limited by the maximum dimension of a Java array as defined by The
 * Java™ Virtual Machine Specification.
 * 
 * Returns: This formatter
 *
 */
public class FormatterDemo
{

	public static void main(String[] args)
	{
		Formatter formatter = new Formatter();

		/*
		 * In this example, the format specifiers, %s and %d are
		 * replaced with the arguments that follow the format string.
		 * %s is replaced by "Peter", %d is replaced by 10. %s
		 * specifies a string, and %d specifies an integer value. All
		 * other characters are simply used as-is.
		 */
		formatter.format("%s age is %d", "Peter", 10);
		System.out.println(formatter.out());
		formatter.close();
	}

}
