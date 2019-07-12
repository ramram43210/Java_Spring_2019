import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo
{

	public static void main(String[] args)
	{

		ClassLoader cl = ClassLoader.getSystemClassLoader();

		ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle",
				Locale.US, cl);

		String value = bundle.getString("greeting");

		System.out.println("Message in " + Locale.getDefault() + " = " + value);

	}

}
