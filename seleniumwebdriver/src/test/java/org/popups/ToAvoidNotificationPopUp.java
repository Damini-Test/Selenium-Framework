package org.popups;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAvoidNotificationPopUp {

	public static void main(String[] args) {
		 ChromeOptions options=new ChromeOptions();
		 //options.addArguments("--disable-notifications",
		options.addArguments("--start-maximized" );
		 WebDriver driver = new ChromeDriver(options);
		// driver.manage().window().maximize();
		// driver.get("https://www.easemytrip.com/");
		 driver.get("https://www.youtube.com/");
		 

	}

}
