package Food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class LaunchBurgerKing_test {


	@Test
	public void BurgerKing () throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("window is maximized, true");
		driver.get("https://www.burgerking.in/");
		Thread.sleep(2000);
		driver.quit();
		
	}
}
