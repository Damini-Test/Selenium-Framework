package org.popups;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ToHAndleAPromptBoxInDemoQA {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/alerts");
		WebElement promtButton = driver.findElement(By.id("promtButton"));
		Actions action= new Actions(driver);
		action.scrollFromOrigin(ScrollOrigin.fromElement(promtButton), 0, 250).perform();
		promtButton.click();
		 Alert alerT = driver.switchTo().alert();
		 alerT.sendKeys("damini varle");
		 alerT.accept();
		
		
		
		 

	}

}
