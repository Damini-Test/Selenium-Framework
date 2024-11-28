package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WindowType;

public class ToFetchCssPropertyvalues {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.findElement(By.linkText("Log in")).click();
		 driver.findElement(By.id("Email")).sendKeys("Harsha",Keys.TAB);
		 WebElement errorMsg = driver.findElement(By.xpath("//span[text()='Please enter a valid email address.']"));
		 String color=errorMsg.getCssValue("color");
		 System.out.println(color);
		 
		 

	}

}
