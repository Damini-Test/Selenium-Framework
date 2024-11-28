package locatorsstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingAddToCartUsingDependentIndependentxpath {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.name("q")).sendKeys("Best Phone under 5000",Keys.ENTER);
		 driver.findElement(By.xpath("//div[text()='itel A23s (Coastel Gold, 32 GB)']/../../..//*[name()='svg']")).click();
		 
		 
		 
	}

}
