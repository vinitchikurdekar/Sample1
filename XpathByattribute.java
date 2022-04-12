package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByattribute {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver" ,"E:\\Class Velocity\\chromedriver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("maliprakash8008@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mali7620015500");
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
//		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
//link for sign up	driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjQ2MDQ1ODc0LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");
		
	//	driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
	}

}
