package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
      protected static WebDriver driver;
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\AllDriversFolder\\chromedriver.exe");
	 
		 driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.saucedemo.com/");
		 
	
	
	
	}
	
	
	
	
}
