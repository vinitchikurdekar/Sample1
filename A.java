package screenshot1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import config.Configuration;

public class A {
	
	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", Configuration.driverpath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Configuration.appUrl);
		driver.manage().window().maximize();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Date d = new Date();
        String date = d.toString();
		String str = date.replace(":", "_"); 
		
		File f = new File(Configuration.screenshotPath+str+".jpg");
		
		FileHandler.copy(src, f);
	}

}
