package Reports;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import freemarker.core.ReturnInstruction.Return;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshot {

	public String takeScreenshot(WebDriver driver)
	{
		
		LocalDateTime dateTime= LocalDateTime.now();
		String date= dateTime.toString().replace(":", "-");
		String ScreenshotPath= "./screenshot/"+date+".png";
        TakesScreenshot ts= (TakesScreenshot)driver;
        File scr=ts.getScreenshotAs(OutputType.FILE);
        File trg= new File(ScreenshotPath);
        try {
			FileHandler.copy(scr, trg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return "." + ScreenshotPath;
		

	}
	
}
