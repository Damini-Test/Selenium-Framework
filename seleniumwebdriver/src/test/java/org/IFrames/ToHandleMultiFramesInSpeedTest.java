package org.IFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleMultiFramesInSpeedTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		//driver.switchTo().frame("iframeResult");
		WebElement ifrm = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(ifrm);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		  
	}

}
