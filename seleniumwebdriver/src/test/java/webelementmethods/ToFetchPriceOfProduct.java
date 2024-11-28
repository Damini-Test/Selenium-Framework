package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchPriceOfProduct {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));//.sendKeys("Iphone 16",Keys.ENTER);
		 System.out.println(searchbox.getTagName());
		 searchbox.sendKeys("Iphone 16",Keys.ENTER);
		 WebElement price = driver.findElement(By.xpath("//span[text()='Apple iPhone 16 Plus (128 GB) - White']/../../../../..//span[@class ='a-price-whole']"));
         System.out.println(price.getText());
	}

}
