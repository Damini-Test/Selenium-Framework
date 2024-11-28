package org.batchExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Adidas {
	@Test
	public void launchadidas() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.adidas.co.in/");
		Reporter.log("Adidas is lauched", true);
		driver.quit();

	}

}
