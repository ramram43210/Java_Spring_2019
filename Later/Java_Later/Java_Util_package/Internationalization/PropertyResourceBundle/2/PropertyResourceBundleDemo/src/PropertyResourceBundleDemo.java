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
			 * Returns:
			 * 
			 * a Set of all keys contained in this ResourceBundle and
			 * its parent bundles.
			 * 
			 */
			Set<String> keySet = bundle.keySet();

			for (String key : keySet)
			{
				String value = bundle.getString(key);
				System.out.println(key + " = " + value);
			}
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
