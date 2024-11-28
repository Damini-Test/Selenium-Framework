package org.IFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFramesInSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		// driver.switchTo().frame(0);
		// driver.switchTo().frame("send-sms-iframe");
		WebElement Frame = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(Frame);
		driver.findElement(By.id("regEmail")).sendKeys("8830852376");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("hamburger")).click();

	}

}
