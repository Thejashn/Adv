package Beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchLoreal_test {

	@Test
	public void Loreal() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("window is maximized, true");
		driver.get("https://www.lorealparis.co.in/");
		Thread.sleep(2000);
		driver.quit();
		
	}
}