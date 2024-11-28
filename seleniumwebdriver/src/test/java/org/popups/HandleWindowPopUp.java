package org.popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/91899/Downloads/popup.html");
		String parentpagehandle = driver.getWindowHandle();
		System.out.println(parentpagehandle);
		driver.findElement(By.id("PopUp")).click();
		Set<String> subwebPageHandle = driver.getWindowHandles();
	    System.out.println(subwebPageHandle);
		subwebPageHandle.remove(parentpagehandle);

		for (String windowIds : subwebPageHandle) {
			driver.switchTo().window(windowIds);
		}
	    Thread.sleep(1500);
		driver.close();

	}

}
