package org.TestNgWorks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchingTourisumSites {

	@Test(timeOut=5000)
	public void maharashtra() {
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser Launch",true);
		driver.manage().window().maximize();
		Reporter.log("Browser maximised",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Reporter.log("Browser will wait",true);
		driver.get("https://www.maharashtratourism.gov.in/");
		Reporter.log("Navigate to Maharashtra Tourism",true);
		driver.quit();
	}

	@Test(enabled=false)
	public void Karnataka() {
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser Launch", true);
		driver.manage().window().maximize();
		Reporter.log("Browser maximised", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Reporter.log("Browser will wait", true);
		driver.get("https://karnatakatourism.org/");
		Reporter.log("Navigate to Maharashtra Tourism", true);
		driver.quit();

	}

}
