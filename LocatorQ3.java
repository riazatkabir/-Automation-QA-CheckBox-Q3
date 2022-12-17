package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorQ3 extends BaseDriverQ3
{
	@Test (priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(itera);
		driver.manage().window().maximize();
	}
	
	@Test (priority = 1)
	public void testLocators() throws InterruptedException{
		
		WebElement tuesday = driver.findElement(By.id("tuesday"));
		tuesday.click();
		Thread.sleep(2000);
		
		WebElement friday= driver.findElement(By.id("tuesday"));
		friday.click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
	}


}
