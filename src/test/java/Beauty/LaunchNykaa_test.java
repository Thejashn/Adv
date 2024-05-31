package Beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchNykaa_test {

	
	@Test
	public void Nykaa() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("window is maximized, true");
		//driver.get("https://www.nykaa.com/");
		String url = System.getProperty("url");
		driver.get(url);
		Thread.sleep(2000);
		driver.quit();
		
	}
}
