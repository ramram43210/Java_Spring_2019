import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.PropertyResourceBundle;

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

			Enumeration<String> keys = bundle.getKeys();

			while (keys.hasMoreElements())
			{
				String key = keys.nextElement();
				String value = bundle.getString(key);
				System.out.println(key+" = "+value);
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
