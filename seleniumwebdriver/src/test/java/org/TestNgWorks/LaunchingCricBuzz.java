package org.TestNgWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchingCricBuzz {

	@Test(invocationCount=5,threadPoolSize=5)
	public void launApplication() {

		WebDriver driver = new ChromeDriver();

		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
		Reporter.log("Window is Maximized",true);
		driver.get("https://www.bing.com/");
		Reporter.log("Navigate to CricBuzz application",true);
		//driver.quit();
		Reporter.log("Browser is Closed",true);

	}

}
