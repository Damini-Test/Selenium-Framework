package SelectClassMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomatingOmayoWebsite {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement multiselectopts = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(multiselectopts);
		select.selectByIndex(3);
		

		
		
		
		
		
		 
	}

}
