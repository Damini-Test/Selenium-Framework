package org.syncronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToApplyExplicitlyWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		WebDriverWait Exlwait = new WebDriverWait(driver, Duration.ofSeconds(15));
		// WebDriverWait is a Class , we are giving driver reference here
		driver.get("https://www.shoppersstack.com/products_page/23");// "https://www.shoppersstack.com/");
		// driver.findElement(By.id("men")).click();
		WebElement ChkDelTextBox = driver.findElement(By.id("Check Delivery"));
		WebElement CheckBtn = driver.findElement(By.id("Check"));
		ChkDelTextBox.sendKeys("411033");
		Exlwait.until(ExpectedConditions.elementToBeClickable(CheckBtn));
		// ExpectedConditions is a class having different static methods of conditions
		// like elementToBeClickable
		CheckBtn.click();
		FluentWait fw = new FluentWait(driver);
		fw.withTimeout(Duration.ofSeconds(15));
		fw.pollingEvery(Duration.ofMillis(250)); // we can change the polling frequency or period for webelement
		fw.until(ExpectedConditions.elementToBeClickable(CheckBtn));
		fw.ignoring(NoSuchElementException.class);

	}

}
