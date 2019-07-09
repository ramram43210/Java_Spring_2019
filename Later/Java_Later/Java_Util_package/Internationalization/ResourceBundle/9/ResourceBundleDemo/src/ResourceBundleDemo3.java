import java.util.Locale;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;

public class ResourceBundleDemo3
{

	public static void main(String[] args)
	{

		/*
		 * create a new ResourceBundle.Control with default format
		 */
		ResourceBundle.Control rbc = ResourceBundle.Control
				.getControl(Control.FORMAT_DEFAULT);

		ClassLoader cl = ClassLoader.getSystemClassLoader();

		/*
		 * Returns a resource bundle using the specified base name,
		 * target locale, class loader and control
		 */
		ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle",
				Locale.US, cl, rbc);

		String value = bundle.getString("greeting");

		System.out.println("Message in " + Locale.getDefault() + " = " + value);

	}

}
