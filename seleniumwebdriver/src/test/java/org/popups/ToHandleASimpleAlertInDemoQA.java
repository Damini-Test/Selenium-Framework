package org.popups;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ToHandleASimpleAlertInDemoQA {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 WebDriverWait explicitwait= new WebDriverWait(driver,Duration.ofSeconds(15));
		 driver.get("https://demoqa.com/alerts");
		 WebElement button = driver.findElement(By.id("timerAlertButton"));
		 Actions action= new Actions(driver);
		 action.scrollFromOrigin(ScrollOrigin.fromElement(button), 0, 200).perform();
		 button.click();
		 
		 explicitwait.until(ExpectedConditions.alertIsPresent());
		 Alert alerT = driver.switchTo().alert();
		 System.out.println(alerT.getText());
		 alerT.accept();
		 
		 
		 

	}

}
