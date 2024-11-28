package org.popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ToHandleSimpleConfirmBoxInDemoQA {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/alerts");
		Actions action = new Actions(driver);
		WebElement confirmbox = driver.findElement(By.id("confirmButton"));
		action.scrollFromOrigin(ScrollOrigin.fromElement(confirmbox),0,250).perform();
        confirmbox.click();		
		Alert alerT = driver.switchTo().alert();
		alerT.accept();
		
		

	}

}
