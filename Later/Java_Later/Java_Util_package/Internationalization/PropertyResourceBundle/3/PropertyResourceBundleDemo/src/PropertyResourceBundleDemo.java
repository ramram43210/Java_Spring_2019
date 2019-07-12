import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.PropertyResourceBundle;
import java.util.Set;

public class PropertyResourceBundleDemo
{

	public static void main(String[] args)
	{

		File file = new File(
				"D:\\eclipse\\workspace\\PropertyResourceBundleDemo\\src\\MessageBundle_en_US.properties");

		try (InputStream inputStream = new FileInputStream(file))
		{

			PropertyResourceBundle bundle = new PropertyResourceBundle(
					inputStream);
			/*
			 * Parameters:
			 * 
			 * key - the key for the desired object
			 * 
			 * Returns:
			 * 
			 * the object for the given key, or null
			 */
			Object res1 = bundle.handleGetObject("greeting");
			Object res2 = bundle.handleGetObject("welcome");

			// Print resource contents
			System.out.println("[Resource1] " + res1);
			System.out.println("[Resource2] " + res2);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
