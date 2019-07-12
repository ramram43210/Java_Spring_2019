import java.util.Locale;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;

public class ResourceBundleDemo2
{

	public static void main(String[] args)
	{

		/*
		 * create a new ResourceBundle.Control with default format
		 */
		ResourceBundle.Control rbc = ResourceBundle.Control
				.getControl(Control.FORMAT_DEFAULT);

		/*
		 * Returns a resource bundle using the specified base name,
		 * the target locale and the specified control
		 */
		ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle",Locale.FRANCE, rbc);
		
		String value = bundle.getString("greeting");

		System.out.println("Message in " + Locale.getDefault() + " = " + value);

	
	}

}
