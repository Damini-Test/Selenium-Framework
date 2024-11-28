package PracticeForInterview;


import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverMethodsAndLocators {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebDriverWait explicitWait= new WebDriverWait(driver,Duration.ofSeconds(5));
		 driver.get("https://practice.expandtesting.com");
		 
		 Actions action= new Actions(driver);
		 WebElement screlement = driver.findElement(By.xpath("//a[@href=\"/inputs\"]"));
		 action.moveToElement(screlement).perform();
		 driver.findElement(By.xpath("//a[@href=\"/inputs\"]")).click();
		 //explicitWait.until(ExpectedConditions.alertIsPresent());
		// Alert alert= driver.switchTo().alert();
		// System.out.println(alert.getText());
		// alert.dismiss();


		 WebElement datet = driver.findElement(By.name("input-date"));
         action.scrollToElement(datet).perform();
		 driver.findElement(By.id("input-number")).sendKeys("234567890");
		 driver.findElement(By.name("input-text")).sendKeys("Damini");
		 driver.findElement(By.name("input-password")).sendKeys("45367@");
		 datet.sendKeys("1/01/2024");
		 driver.findElement(By.xpath("//button[@id='btn-display-inputs']")).click();
	}

}
