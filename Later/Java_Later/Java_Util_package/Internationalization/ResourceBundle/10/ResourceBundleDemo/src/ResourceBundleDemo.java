import java.util.Enumeration;
import java.util.ResourceBundle;

public class ResourceBundleDemo
{

	public static void main(String[] args)
	{

		ResourceBundle rb = ResourceBundle.getBundle("MessageBundle");

		System.out.println(rb.getString("Hello"));
		System.out.println(rb.getString("Goodbye"));
		
		Enumeration<String> enumeration = rb.getKeys();
		
		/*
		 * Print all the keys and corresponding values
		 */
		while (enumeration.hasMoreElements())
		{
			Object key = enumeration.nextElement();
			Object value = rb.getObject(key.toString());
			System.out.println(key+" = "+value);
		}

	}

}
