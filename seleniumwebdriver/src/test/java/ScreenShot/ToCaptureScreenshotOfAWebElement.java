package ScreenShot;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

class ToCaptureScreenshotOfAWebElement {

	public static void main(String[] args) throws IOException {
		LocalDateTime ldt = LocalDateTime.now();
		String timeStamp = ldt.toString().replaceAll(":","-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cadburygifting.in/personalised-gifts.html");
		WebElement product =driver.findElement(By.xpath("//div[contains(text(),'Happy Birthday Tin Box')]/../../../.."));
		
		File screenshot = product.getScreenshotAs( OutputType.FILE);
		File dest= new File(".\\errorshots\\"+timeStamp+"screenshot.png");
		FileHandler.copy(screenshot, dest);
		
		
		 
	}

}
