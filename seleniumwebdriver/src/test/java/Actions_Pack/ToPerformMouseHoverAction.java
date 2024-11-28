package Actions_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.reliancedigital.in/");
		 Thread.sleep(9000);
		 driver.findElement(By.id("wzrk-cancel")).click();
		 WebElement hmapl = driver.findElement(By.xpath("//div[text()='Home Appliances']"));
		 
		 Actions actions=new Actions(driver);
		 actions.moveToElement(hmapl).perform();
		 
		 
				 
				 
	}

}
