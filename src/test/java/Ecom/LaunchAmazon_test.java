package Ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchAmazon_test {

	
	public class LaunchLoreal_test {

		@Test
		public void Amazon() throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Reporter.log("window is maximized, true");
			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
			driver.quit();
			
		}
	}
}
