package org.popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildWindowPopUpInSBI {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		String parentwindowID = driver.getWindowHandle();
		System.out.println(parentwindowID);
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username")).click();
		Set<String> allwindowids = driver.getWindowHandles();

		// login to switch for window pop up
		allwindowids.remove(parentwindowID);
		for (String windowId : allwindowids) {
			driver.switchTo().window(windowId);
		}
		driver.findElement(By.id("nextstep")).click();
		driver.findElement(By.id("userName")).click();
		driver.findElement(By.id("nextstep")).click();

	}

}
