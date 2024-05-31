package Reports;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Script {

	@Test
	
	public void script() throws InterruptedException {
		
		WebDriver driver;
		Screenshot ss= new Screenshot();
		LocalDateTime dateTime= LocalDateTime.now();
		String date= dateTime.toString().replace(":", "-");
		ExtentReports reports= new ExtentReports();
		ExtentSparkReporter reporter= new ExtentSparkReporter("./reportFile/"+date+"+html");
		reports.attachReporter(reporter);
		ExtentTest test= reports.createTest("books");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		test.log(Status.INFO, "browser is maximised");
		driver.get("https://demowebshop.tricentis.com/");
		test.log(Status.INFO, "demowebshop application is launched");
		driver.findElement(By.linkText("Books")).click();
		test.log(Status.INFO, "User clicked on books");
		Thread.sleep(2000);
		test.log(Status.INFO, "wait for 2sec");
		driver.findElement(By.linkText("computing-and-internet")).click();
		driver.findElement(By.id("add-to-cart-button-13")));
		try {
			
			if(driver.getTitle().contains(""))
		}
		
	}
	
}
