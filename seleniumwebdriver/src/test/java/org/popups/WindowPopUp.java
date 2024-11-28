package org.popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/91899/Downloads/popup.html");
		String parentwindowId = driver.getWindowHandle();
		driver.findElement(By.id("PopUp")).click();
		Set<String> allwindowids = driver.getWindowHandles();
		System.out.println(allwindowids);
		allwindowids.remove(parentwindowId);
		for (String windowId : allwindowids) {
			driver.switchTo().window(windowId);
		}
		Thread.sleep(2000);
		driver.close();
		//driver.manage().window().setSize(new Dimension(1000, 0));

	}

}
