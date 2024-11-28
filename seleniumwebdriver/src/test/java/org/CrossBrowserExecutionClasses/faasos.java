package org.CrossBrowserExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class faasos {
	//@Parameter("bname")
	@Test
	public void launchFaasos(@Optional("chrome") String browserName)
	{
		WebDriver driver= null;
		if(browserName.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase(" firefox")) {
			driver= new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase(" edge")) {
			driver= new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.eatsure.com/faasos");
		driver.quit();
		
		
	}

}
