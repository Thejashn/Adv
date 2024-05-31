package Ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchLifestyle_test {

	@Test
	public void Lifestyle() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("window is maximized, true");
		driver.get("https://www.lifestylestores.com/in/en/");
		Thread.sleep(2000);
		driver.quit();
		
	}
}
