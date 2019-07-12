import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo
{

	public static void main(String[] args)
	{

		Locale usLocale = new Locale("en", "US");
		ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", usLocale);

		System.out.println(rb.getString("Hello"));
		System.out.println(rb.getString("Goodbye"));

		Locale frenchLocale = new Locale("fr", "FR");
		rb = ResourceBundle.getBundle("MessageBundle", frenchLocale);

		System.out.println();
		
		System.out.println(rb.getString("Hello"));
		System.out.println(rb.getString("Goodbye"));

	}

}
