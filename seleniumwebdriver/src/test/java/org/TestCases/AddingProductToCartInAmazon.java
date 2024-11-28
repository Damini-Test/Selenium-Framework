package org.TestCases;

import java.util.Set;

import org.genericUtilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public class AddingProductToCartInAmazon extends BaseClass{
	
	@Test
	public  void test() {
		driver.get("https://www.amozon.in/");
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Brain",Keys.ENTER);
		driver.findElement(By.xpath("//span[contains(text(),'Brain model removable in 4 parts')]")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
	    for(String windowId : allWindowIds)
	    {
	    	driver.switchTo().window(windowId);
	    }
		driver.findElement(By.id("add-to-cart-button")).click();
		
	}

}


