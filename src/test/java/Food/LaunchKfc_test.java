package Food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchKfc_test {
	
	@Test
	public void Kfc () throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("window is maximized, true");
		driver.get("https://online.kfc.co.in/");
		Thread.sleep(2000);
		driver.quit();
		
	}
}
