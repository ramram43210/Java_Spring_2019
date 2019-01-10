import java.text.CharacterIterator;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo
{
	public static void main(String[] args)
	{
		Date date =  new Date();
		System.out.println("date = "+date);
		
		Format formatter = new SimpleDateFormat("MM/dd/yyyy");

		/*
		 * Parameters:
		 * 
		 * obj - The object to format
		 * 
		 * Returns:
		 * 
		 * Attributed CharacterIterator describing the formatted
		 * value.
		 */
		CharacterIterator ci = formatter.formatToCharacterIterator(date);

		for (char ch = ci.first(); ch != CharacterIterator.DONE; ch = ci.next())
		{
			System.out.print(ch);
		}
	}

}
