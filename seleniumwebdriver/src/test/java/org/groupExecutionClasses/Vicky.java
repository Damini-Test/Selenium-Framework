package org.groupExecutionClasses;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Vicky {
	@Test(groups="Bollywood")
	public void launchVicky() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Vicky_Kaushal");
		driver.quit();
		
		
		
	}

}
