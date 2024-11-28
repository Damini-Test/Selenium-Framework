package org.JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollAWebPageByUsingScrollByofjs {

	public static void main(String[] args) {
		WebDriver driver =new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/cart");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeAsyncScript("Window.scrollBy(0,800)");
		jse.executeAsyncScript("Window.scrollBy(0,400)");

			
		
		
				
	
	
	
	
	}

}
