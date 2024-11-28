package org.genericUtilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


 

public class BaseClass {
	 public static WebDriver driver;
		
		@BeforeSuite
		public void beforeSuite() {
			System.out.println("Before suite");
		}
		
		@BeforeTest
		public void beforeTest() {
			System.out.println("Before Test");
		}
		
		@Parameters("bname")
		@BeforeClass
		public void launchAndMaximizeBrowse(@Optional("chrome")String browserName) {
			
			if(browserName.equalsIgnoreCase("chrome"))
			{
				driver=new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("edge"))
			{
				driver=new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		
			@BeforeMethod
			public void beforeMethod() {
				System.out.println("Before method");
			}
			
			@AfterMethod
			public void afterMethod() {
				System.out.println("After method");
			}
			
			@AfterClass
			public void tearDownBrowser() {
				driver.close();
				driver.quit();
			}
			
			@AfterTest
			public void afterTest() {
				System.out.println("After Test");
			}
			
			@AfterSuite
			public void afterSuite() {
				System.out.println("After Suite");
			}
			
	   }


