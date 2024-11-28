package org.automation_generic_utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

/**
 * *@author 91899
 * This Class contain reusible component related to the Selenium webDriver
 * 
 */
public class WebDriverUtility {
	
	private static final String ERRORSHOTPATH = null;




	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}
	
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
		
	}
	
	public void sendDataToAlert(WebDriver driver,String Data) {
		driver.switchTo().alert().sendKeys(Data);
		
	}
	
	public String fetchTextFromAlert(WebDriver driver) {
		
		return driver.switchTo().alert().getText();
		
		
		
	}







/**
 * 
 * 
 * 
 * 
 */

public void captureScreenShot(WebDriver driver)
{
	LocalDateTime ldt=LocalDateTime.now();
	String timeStamp=ldt.toString().replaceAll(":", "-");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File screenshot = ts.getScreenshotAs(OutputType.FILE);
	File dest= new File(ERRORSHOTPATH+ timeStamp+ "Screenshot.png");
	try {
		FileHandler.copy(screenshot, dest);
	} catch (IOException e)
	{
		
	}
}
}
	
	
	