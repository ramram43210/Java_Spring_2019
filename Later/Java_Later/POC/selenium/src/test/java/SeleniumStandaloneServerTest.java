import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Tests for selenium standalone server.
 * 
 * @author parsentev
 * @since 19.11.2015
 */
public class SeleniumStandaloneServerTest
{

	/*@Test
	public void executeFirefoxDriver() throws MalformedURLException
	{
		this.execute(DesiredCapabilities.firefox());
	}
*/
	@Test
	public void executeChrome() throws MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver","D:/Download/chromedriver.exe");
		this.execute(DesiredCapabilities.chrome());
		
		
	}

	private void execute(final DesiredCapabilities capability)
			throws MalformedURLException
	{
		
		System.setProperty("webdriver.chrome.driver","./webdriver/chromedriver.exe");
		String URL = "http://www.DemoQA.com";
 		String Node = "http://192.168.140.79:4444/wd/hub";
 		WebDriver driver = new RemoteWebDriver(new URL(Node), capability);
 
 		driver.navigate().to(URL);
 		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		driver.quit();
	}
}
