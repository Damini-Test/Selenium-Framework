package org.parallelExecutionClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hero {
	@Test
	public void Hero() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.heromotocorp.com/");
        Reporter.log("Hero Website Launched", true);
		driver.quit();
		
	}
	@Test
	public void Heromax() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.heromotocorp.com/en-in/exchange.html");
        Reporter.log("Hero Website Launched", true);
		driver.quit();
		
		
		
	}
	
	

}
