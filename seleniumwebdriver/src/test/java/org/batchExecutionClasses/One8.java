package org.batchExecutionClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class One8 {
	@Test
	public void launOne8() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://one8.com/");
		Reporter.log("One8 is lauched", true);
		driver.quit();


}
}

